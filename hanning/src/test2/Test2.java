package test2;

import javax.swing.*;

public class Test2 {

	public static void main(String[] args) {
		double sum, cha, ji, shang;
		String s1 = JOptionPane.showInputDialog("�������һ������:");
		String s2 = JOptionPane.showInputDialog("������ڶ�������:");
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		sum = n1 + n2;
		cha = n1 - n2;
		ji = n1 * n2;
		shang = n1 / n2;
		JOptionPane.showMessageDialog(null, "��:" + sum +  "/n��:" + cha + "/n��" + ji +  "/n��" + shang);
	}

}
