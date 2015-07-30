
public class ArraySave {

	public static void printArray(int n[]){
		System.out.print("数组的元素为：");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * 在java中，定义一个数组并初始化以后，数组名中存储的是一个地址（数组元素存储区域的首地址）,
		 * 我们可以把数组名复制给一个相同类型的数组名.
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
		
		a=b;//数组a和数组b引用内存中同一块数组存储区域，a和b完全是同一个数组
		
		System.out.println("执行a=b之后：");
		printArray(a);
		printArray(b);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]+1;
		}
		printArray(a);
		printArray(b);		
		
	}

}
