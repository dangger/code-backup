
public class UseMethod {

	public static int pow(int x,int y){//��x��y���ݣ��ٶ�x,y����������
		int r=1;
		for(int i=1;i<=y;i++){
			r=r*x;
		}
		return r;
	}
	
	public static void main(String[] args) {
		/*
		 * ����static(��̬����)������ͨ��������.������������ʽ���Ե��ø÷���������ڷ������ڵ����е��ã�
		 * ������������ʡȥ������Ҫ�������������ã���������ʡȥ��
		 */
		System.out.println(pow(2, 10));		
		int n=UseMethod.pow(2, 3);
		
		/*
		 * ����û��static���η��ģ��Ǿ�̬��ʵ����������ֻ�ܡ�������.������������ʽ�����ø÷�����
		 * ��������ĸ�ʽ������ ������=new ��������;
		 */	
		
		UseMethod useMethod=new UseMethod();//����UseMethod��Ķ���
		System.out.println(useMethod.doubleNum(10));
	}
	
	public int doubleNum(int n){//�Ǿ�̬����
		return 2*n;
	}

}
