import javax.swing.JOptionPane;


public class P4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("请输入第一个整数：");
		String s2=JOptionPane.showInputDialog("请输入第二个整数：");
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		
		if(n1%n2==0){
			JOptionPane.showMessageDialog(null, n1+"是"+n2+"的倍数！");
		}else{
			JOptionPane.showMessageDialog(null, n1+"不是"+n2+"的倍数！");
		}
	}

}
