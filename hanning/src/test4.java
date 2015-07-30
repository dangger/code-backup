import javax.swing.JOptionPane;
	public class test4 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("请输入第一个整数");
		String s2 = JOptionPane.showInputDialog("请输入第二个整数");
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		if (n1%n2==0){
			System.out.println(n1+"是"+n2+"的整数倍");}
		else{
			System.out.println(n1+"不是"+n2+"的整数倍");
		}
	}
}
