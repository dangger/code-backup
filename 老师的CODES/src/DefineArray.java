
public class DefineArray {
	
	public static void main(String args[]) {
		/*
		 * ����һά������﷨��ʽΪ:���������  ���������[]  ��    ���������[] ���������
		 * 
		 * ��ʵ����һ���������ȷ���������棺��������ͣ���������֣������ά��(ͨ��[]�Ķ�����ȷ��)
		 *  
		 */
		
		int n[];
		double d[];
		boolean b[];
		char[] ch;
		String[] s;
		//�����������飬ϵͳ����Ϊ�������洢�м䡣��������ڳ�ʼ���Ժ�Ż����洢�ռ䡣
		/*
		 * ��ʼ�����������ַ�ʽ��һ����ͨ��new����ʼ��������һ����ͨ����ֵ���г�ʼ����
		 * ͨ��new��ʼ���ĸ�ʽ��������=new ���������[����ĳ���];
		 * ͨ����ֵ�����г�ʼ�������ݵ����� ���������[]={ֵ1,ֵ2,ֵ3,.....};
		 */
		
		n=new int[10];//��ʼ��������n��������n�ĳ��ȳ�ʼ��Ϊ10����ʱϵͳ��Ϊ����n����10�������Ĵ洢�ռ䣬ÿ���洢�ռ�32λ
		/*
		 * ͨ��new����ʼ������ʱ��ÿ������Ԫ���û�û�и�ֵ��ϵͳ���ÿ������Ԫ��Ĭ��ֵ��
		 * byte��short��int��long���͵�����ϵͳ����Ĭ��ֵ��0
		 * float���͵�����ϵͳ����Ĭ��ֵ��0.0f,double���͵�����ϵͳ����Ĭ��ֵ��0.0
		 * boolean���͵�����ϵͳ����Ĭ��ֵ��false��char���͵�����ϵͳ����Ĭ��ֵ��'\0'(��ʾ�ַ�ֵΪ0���ַ�)
		 * String�������������͵�����ϵͳ����Ĭ��ֵ��null
		 */
		
		//������.length��������ĳ��ȡ�
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
		//null �գ�ʲôҲû��   ��������Ҳû��
		//"" ���ַ���    ������
		
		
		int num[]=new int[100];
		/*
		int num[];
		num=new int[100];
		*/
		
		//�����Ǵ����д��
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
