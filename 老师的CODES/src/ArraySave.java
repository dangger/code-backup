
public class ArraySave {

	public static void printArray(int n[]){
		System.out.print("�����Ԫ��Ϊ��");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * ��java�У�����һ�����鲢��ʼ���Ժ��������д洢����һ����ַ������Ԫ�ش洢������׵�ַ��,
		 * ���ǿ��԰����������Ƹ�һ����ͬ���͵�������.
		 */
		int a[]=new int[3];
		int b[]=new int[5];
		
		float h[]=new float[4];
		double k[]=new double[5];
				
		System.out.println(a);//[I@a90653
		System.out.println(b);//[I@de6ced
		System.out.println(h);
		System.out.println(k);
		
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;
		}
		printArray(a);
		for (int i = 0; i < b.length; i++) {
			b[i]=10*i;
		}
		printArray(b);
		
		a=b;//����a������b�����ڴ���ͬһ������洢����a��b��ȫ��ͬһ������
		
		System.out.println("ִ��a=b֮��");
		printArray(a);
		printArray(b);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]+1;
		}
		printArray(a);
		printArray(b);		
		
	}

}
