
public class TypeConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 数据类型的转换会在以下两种情况产生：
		 * 1、给一个变量赋一个不同类型的值的时候
		 * 2、在一个表达式中参与运算的各变量类型不一致的时侯,总是转向各变量中最高的数据类型【在一个表达式中，byte和short会被自动提升为int类型】
		 * 
		 * 数据类型的转换分为两种：自动转换(隐式转换)和强制转换(显式转换)
		 * 
		 * 什么时候能够自动转换呢？两种类型必须兼容；目的数据类型（=左端）的取值范围比来源数据类型（=右端）的取值范围要大。
		 * 什么时候必须强制转换呢？两种类型必须兼容；目的数据类型（=左端）的取值范围比来源数据类型（=右端）的取值范围要小。
		 * 强制转换要注意来源的数据如果超出了目的数据类型的取值范围，则转换过去不再是原来的值（没有任何意义）。
		 * 另外就是float或double强制转换成整型，小数部分会被舍去（不是四舍五入）。
		 */
		
		/*
		 * char->int
		 * 在java中一个字符，系统为其分配16位(0和1)的内存空间，把这16位的0和1当成一个无符号数转换成10进制的值，称作该字符的字符值
		 * 一个字符这16位的0和1都是规定好的，java采用的标准是unicode字符集
		 */
		
		int n=10;
		float f=n;
		n=(int)f;
		//n=int(f);//错误的写法
		
		
		int k=200;
		byte b=(byte)k;
		System.out.println(b);
		
		double d=3.8;
		n=(int)d;
		System.out.println("n="+n);
		
		int k2=123456789;
		float f2=k2;
		System.out.println(f2);
		
		//double d=3.14;
		//int r=n*f-d;
		
		int m1='a';
		System.out.println(m1);//97
		int m2='A';
		System.out.println(m2);//65
		int m3='你';
		System.out.println(m3);//20320
		
		System.out.println((float)5/8);
		
		
		byte x=50,y=2;
		byte z=(byte)(x*y);
	}

}
