//�˳���Ҫ���û���������������Ȼ������������ǵĺ͡�
import javax.swing.JOptionPane;//ע������Ҳ�ǳ���ı�Ҫ��䣬��ʾ��������е���JOptionPane
public class Test1 {

	public static void main(String[] args) {
		String num1;
		String num2;
		
		int n1;
		int n2;
		int add;
		//��ȡ�û�����ĵ�һ����������ȡ����Ĭ����String���ͣ����ñ���num1����
		num1 = JOptionPane.showInputDialog("�������һ��������");
		
		//��ȡ�û�����ĵڶ�����������ȡ����Ĭ����String���ͣ����ñ���num2����
		num2 = JOptionPane.showInputDialog("������ڶ���������");
		
		//���ַ������͵�num1,num2�ֱ�ת��Ϊint���͵�n1,n2
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);
		
		add = n1 + n2;//����n1��n2�ĺ�
		
		//��ʾ���
		JOptionPane.showMessageDialog(null, n1 + "��" + n2 +"�ĺ��ǣ�" + add);
		
		
	}

	
}

