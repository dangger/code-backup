import javax.swing.JOptionPane;


public class P4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("�������һ��������");
		String s2=JOptionPane.showInputDialog("������ڶ���������");
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		
		if(n1%n2==0){
			JOptionPane.showMessageDialog(null, n1+"��"+n2+"�ı�����");
		}else{
			JOptionPane.showMessageDialog(null, n1+"����"+n2+"�ı�����");
		}
	}

}
