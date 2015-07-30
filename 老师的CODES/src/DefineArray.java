
public class DefineArray {
	
	public static void main(String args[]) {
		/*
		 * 定义一维数组的语法格式为:数组的类型  数组的名字[]  或    数组的类型[] 数组的名字
		 * 
		 * 其实定义一个数组就是确定三个方面：数组的类型，数组的名字，数组的维数(通过[]的对数来确定)
		 *  
		 */
		
		int n[];
		double d[];
		boolean b[];
		char[] ch;
		String[] s;
		//仅仅定义数组，系统不会为数组分配存储中间。数组必须在初始化以后才会分配存储空间。
		/*
		 * 初始化数组有两种方式：一种是通过new来初始化；另外一种是通过赋值进行初始化。
		 * 通过new初始化的格式：数组名=new 数组的类型[数组的长度];
		 * 通过赋值来进行初始化：数据的类型 数组的名字[]={值1,值2,值3,.....};
		 */
		
		n=new int[10];//初始化了数组n，把数组n的长度初始化为10，此时系统会为数组n分配10个连续的存储空间，每个存储空间32位
		/*
		 * 通过new来初始化数组时，每个数组元素用户没有赋值，系统会给每个数组元素默认值。
		 * byte、short、int、long类型的数组系统给的默认值是0
		 * float类型的数组系统给的默认值是0.0f,double类型的数组系统给的默认值是0.0
		 * boolean类型的数组系统给的默认值是false，char类型的数组系统给的默认值是'\0'(表示字符值为0的字符)
		 * String及其他所有类型的数组系统给的默认值是null
		 */
		
		//数组名.length返回数组的长度。
		for (int i = 0; i < n.length; i++) {
			System.out.println("n["+i+"]="+n[i]);
		}
		
		b=new boolean[5];
		for (int i = 0; i <= b.length-1; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
		ch=new char[3];
		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch["+i+"]="+ch[i]);
		}
		
		s=new String[5];
		for (int i = 0; i < s.length; i++) {
			System.out.println("s["+i+"]="+s[i]);
		}
		
		String st1=null,st2="";
		//null 空，什么也没有   连鸡蛋壳也没有
		//"" 空字符串    鸡蛋壳
		
		
		int num[]=new int[100];
		/*
		int num[];
		num=new int[100];
		*/
		
		//以下是错误的写法
		//int m[10];
		//num[]=new int[100];
		//num=new num[100];
		//num=new int[];
		
		int score[]={65,87,52,95,87,99};
		String str[]={"acs","rg","gfi"};
		//double score[];
		//score=new double[]{65,87,52,95,87,99};
		for (int i = 0; i < score.length; i++) {
			System.out.println("score["+i+"]="+score[i]);
		}
	}

}
