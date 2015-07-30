package test2;

import javax.swing.*;

public class Test2 {

	public static void main(String[] args) {
		double sum, cha, ji, shang;
		String s1 = JOptionPane.showInputDialog("请输入第一个整数:");
		String s2 = JOptionPane.showInputDialog("请输入第二个整数:");
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		sum = n1 + n2;
		cha = n1 - n2;
		ji = n1 * n2;
		shang = n1 / n2;
		JOptionPane.showMessageDialog(null, "和:" + sum +  "/n差:" + cha + "/n积" + ji +  "/n商" + shang);
	}

}
