public class TuXing1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {//���
			for (int j = 1; j <= 5 - i; j++) {//�ڲ�1,��������ո�
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {//�ڲ�2,�������*
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 * ��������ɷ���:
		 * 1��ͼ���ж����У����ѭ�����ж��ٴ�
		 * 2��ͼ�ε�ÿһ���м�������ɣ��ڲ���м���forѭ����ÿ��forѭ���ֱ����ͼ����ÿһ�е�ÿ����
		 * 3���ڲ�ÿ��forѭ���Ĵ�����Ҫ����ͼ��ÿһ���ֱ仯�Ĺ������������
		 * 4���ڲ�ѭ������һ��System.out.println();
		 * 
		 */
		
		
		
	}

}
