package test1;

import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("请输入第一个整数:");
		String num2 = JOptionPane.showInputDialog("请输入第二个整数:");
		int n1, n2, sum;
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);
		
		sum = n1 + n2;
		JOptionPane.showMessageDialog(null,n1+"和" +n2 +"的和是:" + sum);
	}
}
