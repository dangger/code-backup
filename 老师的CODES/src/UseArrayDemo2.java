
public class UseArrayDemo2 {

	//������ʾһ��int���������Ԫ��
	public static void printArray(int[] n){//�β��У����������[]����ʡȥ
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int m[]={45,21,0,4,6,87,46};
		printArray(m);//ʵ��m���治��д��[]
		
		doubleArray(m);
		
		/*
		 * ���������������βεĸı��Ӱ��ԭ����ʵ�Ρ�
		 * ������������ʵ�ε�ֵ���ݸ��βΣ�����÷���doubleArray(m)ʱ��m��ֵ(������m����Ԫ�ش洢�����׵�ַ)���ݸ��β�n,
		 * �β�n��m�ͻ��Ϊͬһ�����飬�ı�����n�����ڸı�����m
		 */
		
		printArray(m);
	}
	
	public static int[] doubleArray(int n[]){
		for (int i = 0; i < n.length; i++) {
			n[i]=n[i]*2;
		}
		return n;
	}
	
	
}
