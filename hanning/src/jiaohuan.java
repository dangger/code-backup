import javax.swing.JOptionPane;
public class jiaohuan {

	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("�������һ������");
		String s2=JOptionPane.showInputDialog("������ڶ�������");
		int b;
		int a = Integer.parseInt(s1);
		int c = Integer.parseInt(s2);
		System.out.println("����ǰ��һ������"+a+"\n"+"�ڶ�����Ϊ"+c);
		b=a;
		a=c;
		c=b;
		System.out.println("�������һ����Ϊ"+a+"\n"+"�ڶ�����Ϊ"+c);
		
		
	}

}
