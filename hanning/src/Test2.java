import javax.swing.JOptionPane;
public class Test2 {

	public static void main(String[] args) {
		String num1;
		String num2;
		num1 = JOptionPane.showInputDialog("请输入第一个整数");
		num2 = JOptionPane.showInputDialog("请输入第二个整数");
		
		int s1 = Integer.parseInt(num1);
		int s2 = Integer.parseInt(num2);
		
		int he = s1 + s2;
		int cha = s1 - s2;
		int ji = s1 * s2;
		float shang = s1/s2;
		
		System.out.println(s1 + "与" + s2 +"的和是" + he + "\n"
		+ s1 + "与" + s2 +"的差是" + cha + "\n" +
		s1 + "与" + s2 +"的积是" + ji + "\n" + 
		s1 + "与" + s2 +"的商是" + shang + "\n");
		

	}

}
