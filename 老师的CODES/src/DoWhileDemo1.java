import javax.swing.JOptionPane;


public class DoWhileDemo1 {
	public static void main(String[] args) {
		/*
		 * whileѭ����������ѭ�����ж���������
		 * do..whileѭ������ֱ����ѭ�����ж������ں�
		 * whileѭ����ѭ��������ִ��0��
		 * do..while��ѭ��������ִ��1��
		 */
		
		/*
		 * ������������ָ��������Ч��Χ���Ӷ������ĵط���ʼ�������ڵ�����({}��ס�����)����
		 */	
		
		
		//���û�����������ۼ���ͣ�����0ֹͣ
		int sum=0;
		int n;
		/*do{
			String s=JOptionPane.showInputDialog("�����������ۼ����(����0ֹͣ)��");
			n=Integer.parseInt(s);			
			sum=sum+n;
		}while(n!=0);
		*/
		String s=JOptionPane.showInputDialog("�����������ۼ����(����0ֹͣ)��");
		n=Integer.parseInt(s);
		while(n!=0){
			sum=sum+n;
			s=JOptionPane.showInputDialog("�����������ۼ����(����0ֹͣ)��");
			n=Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
