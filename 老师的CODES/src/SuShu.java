
public class SuShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ҫ�������3~200�����е�����������ָֻ�ܹ���1��������������������
		/*
		���������������
		for (int i = 3; i <=200; i++) {
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					System.out.println(i+"����������");
					break;//�������ڵ�ѭ��
				}
			}
		}
		*/
		for (int i = 3; i <=200; i+=2) {
			boolean is=true;//����һ�����
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					is=false;//˵��i����2~i-1�Ĺ���������������
					break;
				}
			}
			if(is==true){//is==true�����Ļ���˵��˵��i����2~i-1�Ĺ�����û����������
				System.out.println(i+"��������");
			}
		}

	}

}
