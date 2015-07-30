
public class DefineConstant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 在定义变量的基础上加上关键字final，就可以定义常量
		 * 常量一旦一初始化，值就不能再改变
		 * 常量的名字通常全部用大写字母
		 */
		
		final int N=100;
		
		final int M;
		M=300;
		//M=400;//错误的
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);//float能够表示的最大值
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println("h\tello\nworld");
		
		char ch='a';
		System.out.println("ch='"+ch+'\'');//ch='a'
		
		String s="abc";
		System.out.println("s=\""+s+"\"");//s="abc"
		
		System.out.println("a\\c");//a\c
		
	}

}
