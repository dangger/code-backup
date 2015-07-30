
public class DefineVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b;//定义(声明)了一个byte类型的变量b
		b=80;//初始化了变量b，系统为变量b分配8位的内存空间
		b=100;//改变变量的值，系统不会再次给变量b分配内存
		System.out.println("b+1="+(b+1));//+只要有一端是一个字符串就表示连接
		
		int n1=100,n2=200,n3;
		n3=n1+n2;
		n3=n3+100;
		
		int n4;
		//int n5=n4;//错误，变量n4虽然定义了，但没有初始化
		//System.out.println(n4);//错误，变量n4虽然定义了，但没有初始化
		
		//System.out.println(num+100);//错误, num没有定义
		
		long m1=12345678900L,m2=400;//如果给long类型赋的整数制超出int的范围后，值得后面必须写上l或L
		m2=n3+5;
		System.out.println("m2="+m2);
		boolean boo=true;//定义变量的同时进行初始化
		boolean boo2=false;
		float f1=3.14f,f2=10;//如果给float类型赋一个小数值时，值得后面必须写上f或F
		
		double d=3.1415;//如果给double类型赋一个小数值时，值得后面可以写上d或D
		char ch='a';//字符值一定要用''括起来
		/*
		 * 如果仅仅定义了变量，系统不会为变量分配内存空间，
		 * 只有在初始化变量时，系统才会为变量分配内存，
		 * 并且变量的内存只在初始化时分配一次。
		 * 所谓的初始化变量，是指给第一次给变量赋值
		 * 
		 * 变量必须先定义再初始化，并且初始化以后才能使用
		 * 变量不能重复定义
		 */
		
		float f3=123456789;
		f3=500;
		System.out.println(f3);
		
		String s1="你好啊！";
		String s2;
		s2="hello world!";
		
		System.out.println("s1+s2="+s1+s2);
		
	}
}
