
public class OneSelectSort {

	
	
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1};
		//num[2]
		
		int k=0;//kʼ�ռ�¼��Сֵ���ڵ��±�,num[k]���ǵ�ǰ����Сֵ
		for(int i=1;i<=num.length-1;i++){
			if(num[i]<num[k]){
				k=i;				
			}
		}
		//�Ѿ��ҵ�����Сֵnum[k]
		//����num[k]��num[0]
		int temp=num[k];
		num[k]=num[0];
		num[0]=temp;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
