
public class DefineVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b;//����(����)��һ��byte���͵ı���b
		b=80;//��ʼ���˱���b��ϵͳΪ����b����8λ���ڴ�ռ�
		b=100;//�ı������ֵ��ϵͳ�����ٴθ�����b�����ڴ�
		System.out.println("b+1="+(b+1));//+ֻҪ��һ����һ���ַ����ͱ�ʾ����
		
		int n1=100,n2=200,n3;
		n3=n1+n2;
		n3=n3+100;
		
		int n4;
		//int n5=n4;//���󣬱���n4��Ȼ�����ˣ���û�г�ʼ��
		//System.out.println(n4);//���󣬱���n4��Ȼ�����ˣ���û�г�ʼ��
		
		//System.out.println(num+100);//����, numû�ж���
		
		long m1=12345678900L,m2=400;//�����long���͸��������Ƴ���int�ķ�Χ��ֵ�ú������д��l��L
		m2=n3+5;
		System.out.println("m2="+m2);
		boolean boo=true;//���������ͬʱ���г�ʼ��
		boolean boo2=false;
		float f1=3.14f,f2=10;//�����float���͸�һ��С��ֵʱ��ֵ�ú������д��f��F
		
		double d=3.1415;//�����double���͸�һ��С��ֵʱ��ֵ�ú������д��d��D
		char ch='a';//�ַ�ֵһ��Ҫ��''������
		/*
		 * ������������˱�����ϵͳ����Ϊ���������ڴ�ռ䣬
		 * ֻ���ڳ�ʼ������ʱ��ϵͳ�Ż�Ϊ���������ڴ棬
		 * ���ұ������ڴ�ֻ�ڳ�ʼ��ʱ����һ�Ρ�
		 * ��ν�ĳ�ʼ����������ָ����һ�θ�������ֵ
		 * 
		 * ���������ȶ����ٳ�ʼ�������ҳ�ʼ���Ժ����ʹ��
		 * ���������ظ�����
		 */
		
		float f3=123456789;
		f3=500;
		System.out.println(f3);
		
		String s1="��ð���";
		String s2;
		s2="hello world!";
		
		System.out.println("s1+s2="+s1+s2);
		
	}
}
