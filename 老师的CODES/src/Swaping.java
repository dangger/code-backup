
public class Swaping {

	public static void swap(int x,int y){
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x="+x+" y="+y);
	}
	
	public static void main(String[] args) {
		int a=10,b=20;
		swap(a, b);
		System.out.println("a="+a+" b="+b);//a=10 b=20
		/*
		 * �����������͵Ĳ���������ִ��ʱ���βεĸı䲻��Ӱ�쵽ԭ����ʵ��
		 */	
	}
}
