package ShiSi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatRoom extends JFrame implements Runnable {
	private JTextField field;
	private JButton btn, joinBtn;
	private JTextArea area;
	private JComboBox comboBox;
	private MulticastSocket multicastSocket;
	private InetAddress group;
	private int port;
	private Thread thread;// ������鲥���ȡ���ݰ�
	private DatagramPacket receivePacket;// Ԥ�������ݰ������չ㲥

	public ChatRoom() {
		setTitle("�򵥵��������");
		setBounds(200, 100, 800, 400);
		field = new JTextField(20);
		comboBox = new JComboBox(new String[] { "ѧϰ�ռ�", "�������" });
		btn = new JButton("����");
		btn.setEnabled(false);
		joinBtn = new JButton("����");
		area = new JTextArea();
		area.setEnabled(false);
		JPanel panel = new JPanel();
		panel.add(new JLabel("��ѡ��Ҫ����������ң�"));
		panel.add(comboBox);
		panel.add(joinBtn);
		panel.add(new JLabel("���������ݣ�"));
		panel.add(field);
		panel.add(btn);
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		byte p[] = new byte[1024];
		receivePacket = new DatagramPacket(p, p.length);// Ԥ�������ݰ������ܹ㲥

		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n = comboBox.getSelectedIndex();
				if (n == 0) {
					try {
						group = InetAddress.getByName("239.0.0.1");// ��ѧϰ�ռ䡱�鲥��
						try {
							multicastSocket = new MulticastSocket(5858);// �������㲥�׽���
							multicastSocket.setTimeToLive(1);// �����鲥�������淶Χ
						} catch (IOException e) {
							area.setText("5858�˿��г�ͻ��");
						}

						try {
							multicastSocket.joinGroup(group);// �����鲥��ѧϰ�ռ䡱С��
							btn.setEnabled(true);
						} catch (IOException e) {
							area.setText("�޷�����������ң�");
						}
					} catch (UnknownHostException e1) {
						area.setText("�޷������鲥�飡");
					}
				} else if (n == 1) {
					try {
						group = InetAddress.getByName("239.0.0.2");// ��������ء��鲥��
						try {
							multicastSocket = new MulticastSocket(5858);// �������㲥�׽���
							multicastSocket.setTimeToLive(1);// �����鲥�������淶Χ
						} catch (IOException e) {
							area.setText("5858�˿��г�ͻ��");
						}
						try {
							multicastSocket.joinGroup(group);// �����鲥��ѧϰ�ռ䡱С��
							btn.setEnabled(true);
						} catch (IOException e) {
							area.setText("�޷�����������ң�");
						}
					} catch (UnknownHostException e1) {
						area.setText("�޷������鲥�飡");
					}
				}

				thread = new Thread(ChatRoom.this);
				thread.start();
			}
		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String content = field.getText();
				if (content != null) {
					byte b[] = content.getBytes();
					DatagramPacket datagramPacket = new DatagramPacket(b,
							b.length, group, 5858);
					try {
						multicastSocket.send(datagramPacket);
						field.setText(null);						
					} catch (IOException e) {
						area.append("[" + content + "] ����ʧ�ܣ�\n");
					}
				}

			}
		});
	}

	public static void main(String[] args) {
		ChatRoom room = new ChatRoom();
	}

	@Override
	public void run() {
		// ���鲥���н��չ㲥
		while (true) {
			try {
				multicastSocket.receive(receivePacket);
				InetAddress inetAddressFrom = receivePacket.getAddress();
				byte b[] = receivePacket.getData();
				int length = receivePacket.getLength();
				String s = new String(b, 0, length);
				area.append(inetAddressFrom.toString() + "˵��" + s + "\n");
				area.setCaretPosition(area.getText().length());//�ù��ʼ�����ı�������󣬴Ӷ����������Զ����¹���
			} catch (IOException e) {
				area.append("��������ʧ�ܣ�\n");
			}
		}

	}
}
