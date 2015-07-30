
public class StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="abcdef";
		//字符串的长度：指字符串中字符的个数
		//字符串中每个字符都有一个索引，第一个字符的索引是0，往后的每一个字符的索引依次加1，最后一个字符的索引是（长度-1）
		
		char ch=s.charAt(0);//返回指定索引的字符
		System.out.println(ch);
		System.out.println(s.length());//length()方法返回字符串的长度
		
		for (int i = 0; i <=s.length()-1; i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println(s.concat("ghi"));
		
		System.out.println(s.contains("bd"));
		
		System.out.println(s.equals("abcde"));
		//比较字符串时候是否相等不能使用"==",要使用方法equals（String s）;
	}

}
