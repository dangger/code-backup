
public class PrintRectangleUseMethod {

	//������ͨ��������������ض����ܵ�ĳһ�δ��붨��ɷ������ر��������ֹ�����Ҫ����η���ʹ�õ�ʱ��
	
	/*
	 * �Զ���ķ��������main������ƽ�еĹ�ϵ�����Է���main֮ǰ��֮��
	 * �Զ���ķ��������������ڲ�������������
	 */	
	
	
	public static void main(String[] args) {
		printRec(3, 4);//���÷�����3,4����ʵ�ʲ�����ʵ�Σ�
		printRec(5, 5);
		printRec(8, 10);
	}

	/*
	 * �Զ��巽�����*��ɵ�x�У�y�еľ���
	 */
	public static void printRec(int x,int y){//x,y������ʽ�������βΣ���Ҳ�������������Σ�
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	
}
