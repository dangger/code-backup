public class NacissusUseFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��100~999֮���ˮ�ɻ���
		
		//���Է�
		int m=1;
		for (int n = 100; n <= 999; n++) {
			int b=n/100;//�����λ
			int sh=n%100/10;//���ʮλ
			int g=n%10;//�����λ
			/*
			if(b*b*b+sh*sh*sh+g*g*g==n){
				System.out.println(n);
			}
			*/
			
			if(Math.pow(b, 3)+Math.pow(sh, 3)+Math.pow(g, 3)==n){
				System.out.println("�ҵ��˵�"+(m++)+"��ˮ�ɻ�����"+n);
			}
			
		}
		
		

	}

}
