import javax.swing.JOptionPane;//��ʾ������JOptionPane
/*
 * �κ�javaӦ�ó��򶼻��Զ�����java.lang���е������࣬���Ҫʹ��������е���Ͳ���Ҫ��import����
 * ���Ҫʹ��java.lang����������࣬����ͨ��import��ȷ����
 */
public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("�������һ��������",0);//ͨ����������������Ĭ�϶���String
		String num2=JOptionPane.showInputDialog("������ڶ���������",1);
		
		int n1,n2,add;
		
		n1=Integer.parseInt(num1);//Integer��int��Ӧ�������ͣ���������java.lang��������Ҫ����
		n2=Integer.parseInt(num2);
		
		add=n1+n2;
		
		//System.out.println(n1+"��"+n2+"�ĺ��ǣ�"+add);
		//JOptionPane.showMessageDialog(null, n1+"��"+n2+"�ĺ��ǣ�"+add);//��һ��������ʾ��Ϣ���λ�ã�Ŀǰ��д��null����˼�ǲ��涨λ�ã�����ϵͳĬ�ϵģ�
																	//�ڶ���������ʾ��ʾ����Ϣ���ϵ�����
		JOptionPane.showMessageDialog(null, n1+"��"+n2+"�ĺ��ǣ�"+add, "��ʾ���", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.PLAIN_MESSAGE;
		//JOptionPane.INFORMATION_MESSAGE;
		//JOptionPane.ERROR_MESSAGE;
		//JOptionPane.WARNING_MESSAGE;
		//JOptionPane.QUESTION_MESSAGE;
	}
}
