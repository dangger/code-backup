
public class P24 {

	public static int[] ordinalSearch(int data[],int key){
		int n=0;
		for (int i = 0; i < data.length; i++) {
			if(data[i]==key){
				n++;
			}
		}//�Ѿ�֪������data����n��key
		if(n==0){
			int index[]={-1};
			return index;
		}else{
			int index[]=new int[n];
			int j=0;
			for (int i = 0; i < data.length; i++) {
				if(data[i]==key){
					index[j]=i;
					j++;
				}
			}//��key���ڸ��±��������index
			return index;
		}
		
		
		
	}
	public static void main(String[] args) {
		int a[]={7,4,0,6,2,5,1,1,6,0,6,7};
		int index[]=ordinalSearch(a, 6);
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i]+" ");
		}
	}

}
