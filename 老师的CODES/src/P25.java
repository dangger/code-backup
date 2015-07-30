import java.util.Arrays;


public class P25 {

	public static int[][] dyadicArraySort(int a[][]){
		int n=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				n=n+1;
			}
		}//�Ѿ�ͳ���˶�ά����a�е�Ԫ�ظ���n
		int b[]=new int[n];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[k]=a[i][j];
				k++;
			}
		}//�Ѿ��Ѷ�ά����a�еĸ�Ԫ�ظ��Ƶ�һά����b��
		
		Arrays.sort(b);//������b������������
		
		k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=b[k];
				k++;
			}
		}//�������һά����b�еĸ�Ԫ�����θ��Ƶ���ά����a��
		
		return a;
		
	}
	public static void main(String[] args) {
		int num[][]={{15,12,16},{1,14},{0,8,7,20}};
		output(num);
		dyadicArraySort(num);
		output(num);
	}
	public static void output(int a[][]){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

}
