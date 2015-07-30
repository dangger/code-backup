
public class UseArrayDemo2 {

	//用于显示一个int数组的所有元素
	public static void printArray(int[] n){//形参中，数组名后的[]不能省去
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int m[]={45,21,0,4,6,87,46};
		printArray(m);//实参m后面不能写上[]
		
		doubleArray(m);
		
		/*
		 * 数组做参数，对形参的改变会影响原来的实参。
		 * 数组做参数，实参的值传递给形参，如调用方法doubleArray(m)时，m的值(是数组m数组元素存储区的首地址)传递给形参n,
		 * 形参n与m就会成为同一个数组，改变数组n就是在改变数组m
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
