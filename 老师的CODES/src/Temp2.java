
public class Temp2 {

	//7
	//0 1 2 3 4 5 6
	//7,4,0,6,2,5,1
	public static int[] move(int a[],int n){
		int b[]=new int[a.length];
		int k=a.length-n;
		for (int i = 0; i < n; i++) {
			b[i]=a[k];
			k++;
		}
		k=0;
		for(int i=n;i<b.length;i++){
			b[i]=a[k];
			k++;
		}
		return b;
	}
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1,8,-10,9};
		int newNum[]=move(num, 4);
		for (int i = 0; i < newNum.length; i++) {
			System.out.print(newNum[i]+" ");
		}
	}

}
