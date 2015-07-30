import java.util.Arrays;

public class UseArraysMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={7,4,0,6,2,5,1};
		Arrays.sort(a);//把数组按升序排列
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int index=Arrays.binarySearch(a, 3);
		System.out.println(index);	
	}

}
