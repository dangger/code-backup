import javax.swing.JOptionPane;//表示引入类JOptionPane
/*
 * 任何java应用程序都会自动引入java.lang包中的所有类，如果要使用这个包中的类就不需要再import引入
 * 如果要使用java.lang包中以外的类，必须通过import明确引入
 */
public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("请输入第一个整数：",0);//通过输入框输入的内容默认都是String
		String num2=JOptionPane.showInputDialog("请输入第二个整数：",1);
		
		int n1,n2,add;
		
		n1=Integer.parseInt(num1);//Integer是int对应的类类型，该类来自java.lang包，不需要引入
		n2=Integer.parseInt(num2);
		
		add=n1+n2;
		
		//System.out.println(n1+"与"+n2+"的和是："+add);
		//JOptionPane.showMessageDialog(null, n1+"与"+n2+"的和是："+add);//第一个参数表示消息框的位置（目前都写成null，意思是不规定位置，采用系统默认的）
																	//第二个参数表示显示在消息框上的内容
		JOptionPane.showMessageDialog(null, n1+"与"+n2+"的和是："+add, "显示结果", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.PLAIN_MESSAGE;
		//JOptionPane.INFORMATION_MESSAGE;
		//JOptionPane.ERROR_MESSAGE;
		//JOptionPane.WARNING_MESSAGE;
		//JOptionPane.QUESTION_MESSAGE;
	}
}
