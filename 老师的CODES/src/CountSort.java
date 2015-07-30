
public class CountSort {

	public static int[] countSort(int a[]){
		int m[]=new int[a.length];//数组m用来存放有序的数据序列
		int count[]=new int[a.length];//数组count用来存放比数组a中每个元素小的数据的个数,count[0]存放比a[0]小的数据的个数,count[1]存放比a[1]小的数据的个数...
		/*
		for(int i=0;i<=a.length-1;i++){			
			for(int j=0;j<=a.length-1;j++){				
				if(j!=i&&a[j]<a[i]){
					count[i]++;		
				}
			}
		}
		*/
		for(int i=0;i<=a.length-1;i++){			
			for(int j=i+1;j<=a.length-1;j++){				
				if(a[j]<=a[i]){
					count[i]++;		
				}else{
					count[j]++;
				}
			}
		}
		/*
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		*/
		for (int i = 0; i < count.length; i++) {
			m[count[i]]=a[i];
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1};
		int sortNum[]=countSort(num);
		System.out.println("排好序的数组为：");
		for (int i = 0; i < sortNum.length; i++) {
			System.out.print(sortNum[i]+" ");
		}
	}

}
