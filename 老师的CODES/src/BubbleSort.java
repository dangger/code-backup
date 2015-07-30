
public class BubbleSort {

	public static void bubbleSort(int a[]){
		//n����,n=a.length
		//ð������һ����Ҫn-1�ˣ�ÿһ�����������Ĺ�����������һ��������Ե��������������ͬ��
		int n=a.length;
		for(int i=1;i<=n-1;i++){//���n-1�ε�ѭ������ʾn-1�˵�����
			/*for(int j=0;j<=n-1-i;j++){//�ڲ��ѭ����ʾÿ��������Ե��������򣨲��������һ������
				if(a[j]>a[j+1]){//��������ϴ�С�����˳��
					//�ͽ��н���
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}*/
			
			for(int j=1;j<=n-i;j++){//�ڲ��ѭ����ʾÿ��������Ե��������򣨲�������һ������
				if(a[j-1]>a[j]){//��������ϴ�С�����˳��
					//�ͽ��н���
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}				
			}
			
			System.out.print("��"+i+"�������");
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
	
	//�Ľ���ð������
	public static void bubbleSort2(int a[]){
		//n����,n=a.length
		//ð�����������Ҫn-1�ˣ�ÿһ�����������Ĺ�����������һ��������Ե��������������ͬ��
		int n=a.length;
		for(int i=1;i<=n-1;i++){//���n-1�ε�ѭ������ʾn-1�˵�����
			boolean exchange=false;//��ĳһ������ʼǰexchange��false
			for(int j=0;j<=n-1-i;j++){//�ڲ��ѭ����ʾÿ��������Ե��������򣨲��������һ������
				if(a[j]>a[j+1]){//��������ϴ�С�����˳��
					//�ͽ��н���
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					exchange=true;
				}
			}
			
			if(exchange==false){//�����һ�����������exchange����false,˵�����е�a[j]<a[j+1],�����Ѿ��������źã�������ǰ��ֹ
				break;
			}
			
			System.out.print("��"+i+"�������");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}

}
