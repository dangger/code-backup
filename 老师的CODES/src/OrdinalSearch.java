
public class OrdinalSearch {

	//˳����Ҷ������������û��Ҫ��ÿ�Ƚ�һ�ΰѲ��ҵķ�Χ��С1���������ҵ�Ч�ʱȽϵ�
	//n�����Ĳ��ҳɹ���ƽ�����ҳ��ȣ���1+2+3+4+....+n��/n=(1+n)/2
	//n�����Ĳ��Ҳ��ɹ���ƽ�����ҳ��ȣ�n
	public static int ordinalSearch(int a[],int key){
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1};
		int index=ordinalSearch(num, 5);
		if(index==-1){
			System.out.println("δ�ҵ���");
		}else{
			System.out.println("Ҫ���ҵ�Ԫ���������е��±���"+index);
		}
	}

}
