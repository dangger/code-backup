public class RefDemo02 {

	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println("fun()方法调用之前: " + str1);
		fun(str1);
		System.out.println("fun()方法调用之后: " +str1);
	}
public static void fun(String str2){
	str2 = "MLDN";
}
}
//字符串的内容一旦声明便不可改变