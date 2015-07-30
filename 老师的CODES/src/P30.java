import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P30 extends JFrame {
	private JLabel nameJLabel, sexJLabel, favJLabel;
	private JTextField nameJTextField;
	private JRadioButton maleJRadioButton, femaleJRadioButton;
	private JCheckBox musicJCheckBox, literJCheckBox, sportJCheckBox;
	private JButton okJButton, cancelJButton;
	private JTextArea showJTextArea;

	public P30() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		setSize(dimension.width / 2 + 50, dimension.height / 2);
		setLocation(dimension.width / 4, dimension.height / 4);
		setTitle("ѧ��������Ϣ����");

		nameJLabel = new JLabel("������");
		nameJTextField = new JTextField(10);
		sexJLabel = new JLabel("�Ա�");
		maleJRadioButton = new JRadioButton("��", true);
		// maleJRadioButton.setSelected(true);
		femaleJRadioButton = new JRadioButton("Ů");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleJRadioButton);
		buttonGroup.add(femaleJRadioButton);
		favJLabel = new JLabel("��Ȥ��");
		musicJCheckBox = new JCheckBox("����");
		literJCheckBox = new JCheckBox("��ѧ");
		sportJCheckBox = new JCheckBox("����");
		okJButton = new JButton("���");
		cancelJButton = new JButton("ȡ��");
		showJTextArea = new JTextArea(5, 10);
		showJTextArea.setLineWrap(true);
		JScrollPane jScrollPane = new JScrollPane(showJTextArea);

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		container.add(nameJLabel);
		container.add(nameJTextField);
		container.add(sexJLabel);
		container.add(maleJRadioButton);
		container.add(femaleJRadioButton);
		container.add(favJLabel);
		container.add(musicJCheckBox);
		container.add(literJCheckBox);
		container.add(sportJCheckBox);
		container.add(okJButton);
		container.add(cancelJButton);
		container.add(jScrollPane);

		MyActionListener listener = new MyActionListener();
		okJButton.addActionListener(listener);
		cancelJButton.addActionListener(listener);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == okJButton) {
				String s = nameJLabel.getText();
				s += nameJTextField.getText();
				s += "\n" + sexJLabel.getText()
						+ (maleJRadioButton.isSelected() == true ? "��" : "Ů");
				s += "\n" + favJLabel.getText();
				s += musicJCheckBox.isSelected() == true ? musicJCheckBox
						.getText() : "";
				s += literJCheckBox.isSelected() ? "��"
						+ literJCheckBox.getText() : "";
				s += sportJCheckBox.isSelected() ? "��"
						+ sportJCheckBox.getText() : "";

				showJTextArea.setText(s);
			} else if (arg0.getSource() == cancelJButton) {
				nameJTextField.setText(null);
				maleJRadioButton.setSelected(true);
				musicJCheckBox.setSelected(false);
				literJCheckBox.setSelected(false);
				sportJCheckBox.setSelected(false);
				showJTextArea.setText("");
				nameJTextField.grabFocus();
			}

		}

	}

	public static void main(String[] args) {
		P30 p30 = new P30();

	}

}
