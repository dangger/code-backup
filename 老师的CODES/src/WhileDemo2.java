
public class WhileDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1!+2!+3!+...+9!+10!
		
		
		/*
		 * ��һ���й��ɵ�������ĺͣ�
		 * ����˼�룺ÿ��ѭ�������ǰ�Ȼ������ۼӵ�sum��
		 * 
		 * ʽ���ж����ѭ���Ͷ��ٴ�
		 * ѭ�����е�һ��������������ǰ��һ��(�ҵ�һ�����ʽ��ʾʽ���к�һ��ͬǰһ��֮��Ĺ�ϵ��ע����ʽ��ǰ��������һ����������ʾ)
		 * Ȼ������ۼӵ�sum��
		 */
		
		int i=1;
		int p=1;
		int sum=0;
		while(i<=10){
			p=p*i;
			i++;
			sum=sum+p;
		}
		System.out.println(sum);

	}

}
