import java.util.Arrays;


public class P25 {

	public static int[][] dyadicArraySort(int a[][]){
		int n=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				n=n+1;
			}
		}//已经统计了二维数组a中的元素个数n
		int b[]=new int[n];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[k]=a[i][j];
				k++;
			}
		}//已经把二维数组a中的各元素复制到一维数组b中
		
		Arrays.sort(b);//对数组b进行升序排列
		
		k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=b[k];
				k++;
			}
		}//把有序的一维数组b中的各元素依次复制到二维数组a中
		
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
