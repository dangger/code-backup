
public class DefineConstant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �ڶ�������Ļ����ϼ��Ϲؼ���final���Ϳ��Զ��峣��
		 * ����һ��һ��ʼ����ֵ�Ͳ����ٸı�
		 * ����������ͨ��ȫ���ô�д��ĸ
		 */
		
		final int N=100;
		
		final int M;
		M=300;
		//M=400;//�����
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);//float�ܹ���ʾ�����ֵ
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
