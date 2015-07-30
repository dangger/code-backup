
public class BubbleSort {

	public static void bubbleSort(int a[]){
		//n个数,n=a.length
		//冒泡排序一共需要n-1趟，每一趟排序所做的工作本质上是一样（但面对的数组的无序区域不同）
		int n=a.length;
		for(int i=1;i<=n-1;i++){//外层n-1次的循环，表示n-1趟的排序
			/*for(int j=0;j<=n-1-i;j++){//内层的循环表示每次排序面对的无序区域（不包括最后一个数）
				if(a[j]>a[j+1]){//如果不符合从小到大的顺序
					//就进行交换
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}*/
			
			for(int j=1;j<=n-i;j++){//内层的循环表示每次排序面对的无序区域（不包括第一个数）
				if(a[j-1]>a[j]){//如果不符合从小到大的顺序
					//就进行交换
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}				
			}
			
			System.out.print("第"+i+"趟排序后：");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int num[]={32,87,39,4,345,365,9,234};
		bubbleSort(num);
		System.out.println(num[0]);
	}
	
	//改进的冒泡排序
	public static void bubbleSort2(int a[]){
		//n个数,n=a.length
		//冒泡排序最多需要n-1趟，每一趟排序所做的工作本质上是一样（但面对的数组的无序区域不同）
		int n=a.length;
		for(int i=1;i<=n-1;i++){//外层n-1次的循环，表示n-1趟的排序
			boolean exchange=false;//在某一趟排序开始前exchange是false
			for(int j=0;j<=n-1-i;j++){//内层的循环表示每次排序面对的无序区域（不包括最后一个数）
				if(a[j]>a[j+1]){//如果不符合从小到大的顺序
					//就进行交换
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					exchange=true;
				}
			}
			
			if(exchange==false){//如果这一趟排序结束后exchange还是false,说明所有的a[j]<a[j+1],数组已经按升序排好，可以提前终止
				break;
			}
			
			System.out.print("第"+i+"趟排序后：");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}

}
