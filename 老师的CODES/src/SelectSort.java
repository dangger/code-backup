
public class SelectSort {

	public static void selectSort(int a[]){
		//n个数，n=a.length
		
		int n=a.length;
		for(int i=1;i<=n-1;i++){//n个数需要n-1次选择，每次选择的过程本质上相同，但面对的无序区域不同
			int k=i-1;//k始终记录最小值的下标,每次选择开始前默认无序区域的第一个数就是当前的最小值
			for(int j=i;j<=n-1;j++){//每次选择所面临的无序区域（不包括第一个数）
				if(a[j]<a[k]){
					k=j;
				}
			}//循环结束时已经找到本次无序区域最小值的下标k
			//把a[k]交换到无序区域的第1个位置,即a[k]和a[i-1]交换
			int temp=a[k];
			a[k]=a[i-1];
			a[i-1]=temp;
			
			System.out.print("第"+i+"次选择排序后：");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1};
		selectSort(num);
	}

}
