
public class SelectSort {

	public static void selectSort(int a[]){
		//n������n=a.length
		
		int n=a.length;
		for(int i=1;i<=n-1;i++){//n������Ҫn-1��ѡ��ÿ��ѡ��Ĺ��̱�������ͬ������Ե���������ͬ
			int k=i-1;//kʼ�ռ�¼��Сֵ���±�,ÿ��ѡ��ʼǰĬ����������ĵ�һ�������ǵ�ǰ����Сֵ
			for(int j=i;j<=n-1;j++){//ÿ��ѡ�������ٵ��������򣨲�������һ������
				if(a[j]<a[k]){
					k=j;
				}
			}//ѭ������ʱ�Ѿ��ҵ���������������Сֵ���±�k
			//��a[k]��������������ĵ�1��λ��,��a[k]��a[i-1]����
			int temp=a[k];
			a[k]=a[i-1];
			a[i-1]=temp;
			
			System.out.print("��"+i+"��ѡ�������");
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
