
public class StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="abcdef";
		//�ַ����ĳ��ȣ�ָ�ַ������ַ��ĸ���
		//�ַ�����ÿ���ַ�����һ����������һ���ַ���������0�������ÿһ���ַ����������μ�1�����һ���ַ��������ǣ�����-1��
		
		char ch=s.charAt(0);//����ָ���������ַ�
		System.out.println(ch);
		System.out.println(s.length());//length()���������ַ����ĳ���
		
		for (int i = 0; i <=s.length()-1; i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println(s.concat("ghi"));
		
		System.out.println(s.contains("bd"));
		
		System.out.println(s.equals("abcde"));
		//�Ƚ��ַ���ʱ���Ƿ���Ȳ���ʹ��"==",Ҫʹ�÷���equals��String s��;
	}

}
