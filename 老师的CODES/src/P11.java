
public class P11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��������ɷ���:
		 * 1��ͼ���ж����У����ѭ�����ж��ٴ�
		 * 2��ͼ�ε�ÿһ���м�������ɣ��ڲ���м���forѭ����ÿ��forѭ���ֱ����ͼ����ÿһ�е�ÿ����
		 * 3���ڲ�ÿ��forѭ���Ĵ�����Ҫ����ͼ��ÿһ���ֱ仯�Ĺ������������
		 * 4���ڲ�ѭ������һ��System.out.println();
		 * 
		 */
				
		for(int i=1;i<=5;i++){
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=22-4*i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
