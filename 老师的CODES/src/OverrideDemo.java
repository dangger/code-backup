
public class OverrideDemo {

	/*
	 * ����������(overload)��ָ����һ�����д��ڶ����ͬ���Ƶķ�����������Щ�����ġ������������벻ͬ��
	 * ��������ָ�����ĸ��������͡�
	 * ͨ�����صķ����������ƵĹ��ܡ�
	 * �жϷ����ܷ����ص�Ψһ��׼���Ƿ�����һ������������ͬ���������ķ���ֵ������û�й�ϵ��
	 * �ڵ��÷���ʱ��ϵͳ�����ʵ���Զ�ѡ��һ������ʵķ������á�
	 */
	
	public static int add(int x,int y){
		System.out.println("1");
		return x+y;
	}	
	public static double add(double a,double b){
		return a+b;
	}
	public static double add(int a,double b){
		return a+b;
	}
	public static double add(double a,int b){
		return a+b;
	}
	public static int add(int x,int y,int z){
		return x+y+z;
	}
	public static double add(double a,double b,double c){
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(5,6));
		System.out.println(add(5,6.6));	
	}
}
