import javax.swing.JOptionPane;
public class jiaohuan {

	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("请输入第一个数字");
		String s2=JOptionPane.showInputDialog("请输入第二个数字");
		int b;
		int a = Integer.parseInt(s1);
		int c = Integer.parseInt(s2);
		System.out.println("交换前第一个数是"+a+"\n"+"第二个数为"+c);
		b=a;
		a=c;
		c=b;
		System.out.println("交换后第一个数为"+a+"\n"+"第二个数为"+c);
		
		
	}

}
