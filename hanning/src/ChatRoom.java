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
	private Thread thread;// 负责从组播组读取数据包
	private DatagramPacket receivePacket;// 预定义数据包来接收广播

	public ChatRoom() {
		setTitle("简单的聊天程序");
		setBounds(200, 100, 800, 400);
		field = new JTextField(20);
		comboBox = new JComboBox(new String[] { "学习空间", "交友天地" });
		btn = new JButton("发送");
		btn.setEnabled(false);
		joinBtn = new JButton("加入");
		area = new JTextArea();
		area.setEnabled(false);
		JPanel panel = new JPanel();
		panel.add(new JLabel("请选择要进入的聊天室："));
		panel.add(comboBox);
		panel.add(joinBtn);
		panel.add(new JLabel("请输入内容："));
		panel.add(field);
		panel.add(btn);
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		byte p[] = new byte[1024];
		receivePacket = new DatagramPacket(p, p.length);// 预定义数据包来接受广播

		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n = comboBox.getSelectedIndex();
				if (n == 0) {
					try {
						group = InetAddress.getByName("239.0.0.1");// “学习空间”组播组
						try {
							multicastSocket = new MulticastSocket(5858);// 创建多点广播套接字
							multicastSocket.setTimeToLive(1);// 设置组播包的生存范围
						} catch (IOException e) {
							area.setText("5858端口有冲突！");
						}

						try {
							multicastSocket.joinGroup(group);// 加入组播“学习空间”小组
							btn.setEnabled(true);
						} catch (IOException e) {
							area.setText("无法加入该聊天室！");
						}
					} catch (UnknownHostException e1) {
						area.setText("无法创建组播组！");
					}
				} else if (n == 1) {
					try {
						group = InetAddress.getByName("239.0.0.2");// “交友天地”组播组
						try {
							multicastSocket = new MulticastSocket(5858);// 创建多点广播套接字
							multicastSocket.setTimeToLive(1);// 设置组播包的生存范围
						} catch (IOException e) {
							area.setText("5858端口有冲突！");
						}
						try {
							multicastSocket.joinGroup(group);// 加入组播“学习空间”小组
							btn.setEnabled(true);
						} catch (IOException e) {
							area.setText("无法加入该聊天室！");
						}
					} catch (UnknownHostException e1) {
						area.setText("无法创建组播组！");
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
						area.append("[" + content + "] 发送失败！\n");
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
		// 从组播组中接收广播
		while (true) {
			try {
				multicastSocket.receive(receivePacket);
				InetAddress inetAddressFrom = receivePacket.getAddress();
				byte b[] = receivePacket.getData();
				int length = receivePacket.getLength();
				String s = new String(b, 0, length);
				area.append(inetAddressFrom.toString() + "说：" + s + "\n");
				area.setCaretPosition(area.getText().length());//让光标始终在文本区的最后，从而滚动条能自动向下滚动
			} catch (IOException e) {
				area.append("接收数据失败！\n");
			}
		}

	}
}
