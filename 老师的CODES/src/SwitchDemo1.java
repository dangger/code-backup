
public class SwitchDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char grade='A';
		final char ch1='A';
		switch (grade) {
		case ch1:
			System.out.println("����>=90");
			break;
		case 'B':
			System.out.println("80<=����<90");
			break;
		case 'C':			
			System.out.println("70<=����<80");
			break;
		case 'D':
			System.out.println("60<=����<70");
			break;
		default:
			System.out.println("����<60");
			//break;
		}
		
		/*
		 * ע�⣺ÿ��case��������Ϲؼ���break;ÿ��case�����ֵ�����ǳ�������ֵ��
		 * 		ÿ��case�����ֵ�������ظ���ÿ��case����ֻ��дһ��ֵ��
		 * 
		 * switch(��������ʽ){//��������ʽ��ֵֻ����byte��short��int��char���͵ģ���jdk1.7�Ժ�����ʱString���͵�
		 * 		case ֵ1��
		 * 			��������ʽ��ֵ��ֵ1��ʱ��Ҫִ�е���䣨������һ�仰��Ҳ�����Ƕ�仰����
		 * 			break;//����switch�ṹ
		 * 		case ֵ2��
		 * 			��������ʽ��ֵ��ֵ2��ʱ��Ҫִ�е���䣨������һ�仰��Ҳ�����Ƕ�仰����
		 * 			break;
		 * 		case ֵ3��
		 * 			��������ʽ��ֵ��ֵ3��ʱ��Ҫִ�е���䣨������һ�仰��Ҳ�����Ƕ�仰����
		 * 			break;
		 *      ..........
		 *      default://��ѡ��
		 *      	��������ʽ��ֵ����ǰ������case���ֵ��ʱ��Ҫִ�е���䣨������һ�仰��Ҳ�����Ƕ�仰����
		 *      	break;//����ʡȥ
		 * }
		 */
		
		int n=11;
		switch (n%2) {
		case 0:
			System.out.println(n+"��һ��ż����");
			break;
		case 1:
			System.out.println(n+"��һ��������");
			break;
		}
	}

}
