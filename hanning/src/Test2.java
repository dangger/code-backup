import javax.swing.JOptionPane;
public class Test2 {

	public static void main(String[] args) {
		String num1;
		String num2;
		num1 = JOptionPane.showInputDialog("�������һ������");
		num2 = JOptionPane.showInputDialog("������ڶ�������");
		
		int s1 = Integer.parseInt(num1);
		int s2 = Integer.parseInt(num2);
		
		int he = s1 + s2;
		int cha = s1 - s2;
		int ji = s1 * s2;
		float shang = s1/s2;
		
		System.out.println(s1 + "��" + s2 +"�ĺ���" + he + "\n"
		+ s1 + "��" + s2 +"�Ĳ���" + cha + "\n" +
		s1 + "��" + s2 +"�Ļ���" + ji + "\n" + 
		s1 + "��" + s2 +"������" + shang + "\n");
		

	}

}
