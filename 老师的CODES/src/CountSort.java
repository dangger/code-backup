
public class CountSort {

	public static int[] countSort(int a[]){
		int m[]=new int[a.length];//����m��������������������
		int count[]=new int[a.length];//����count������ű�����a��ÿ��Ԫ��С�����ݵĸ���,count[0]��ű�a[0]С�����ݵĸ���,count[1]��ű�a[1]С�����ݵĸ���...
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
		System.out.println("�ź��������Ϊ��");
		for (int i = 0; i < sortNum.length; i++) {
			System.out.print(sortNum[i]+" ");
		}
	}

}
