
public class YunSuanFu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10,m=3;
		//n%=m;//n=n%m;
		//System.out.println(n);
		int k=n+m;
		System.out.println(k);
		k=n/m;
		System.out.println(k);
		k=n%m;//��n����m��������ģ������n������ģ����m����ģ��
		System.out.println(k);
		//%�ж�һ�����ܷ�����һ��������
		
		/*
		 * ++,--������������ڱ���֮ǰ��Ҳ�������ڱ���֮��ע��������ֻ�����ڱ����ϣ��������ڳ�������ʽ�ϡ�
		 * �ڱ��ʽ�У�++���ڱ���֮�󣬱�ʾ��ʹ�ñ�����ֵ��Ȼ���ټ�1
		 *          ++���ڱ���֮ǰ����ʾ�ȼ�1��Ȼ����ʹ�ñ�����ֵ
		 */
		int x=5;
		x++;//x=x+1;
		System.out.println(x);
		++x;//x=x+1;
		System.out.println(x);		
		
		
		int z=10;
		int a=z++*5;
		System.out.println("a="+a+" z="+z);
		int b=++z*5;
		System.out.println("b="+b+" z="+z);
		
		final int y=8;
		//y++;//����
		//(x+1)++;//����
		
		/*
		 * ��ϵ���Ƚϣ��������ʹ���˹�ϵ������ı��ʽ������ϵ���ʽ����ϵ���ʽ����boolean���͵�ֵ
		 */
		n=1;
		m=3;
		boolean b2=n>m;
		System.out.println("b2="+b2);
		System.out.println(6>=6);
		System.out.println(6<=6);
		System.out.println(n==m);//�мǣ��ж��Ƿ���Ȳ���д��һ��=
		System.out.println(n!=m);
		
		/*
		 * �߼������(ֻ��boolean���Ͳ��ܽ����߼�����)
		 * &��&&  |��||������˫Ŀ�����
		 * &��&& �����㣬�������ֻ�����˶�Ϊtrue�����ղ���true
		 * |��|| �����㣬�����������ֻҪ��һ��Ϊtrue�����վ���true
		 * 
		 * &��&&���������ǰ����false,���տ϶�����false�����ʹ��&��������ȻҪ�������㣻���ʹ��&&�����˲��ٽ������㣻
		 * |��||���������ǰ����true,���տ϶�����true�����ʹ��|��������ȻҪ�������㣻���ʹ��||�����˲��ٽ������㣻
		 * 
		 * ʵ�ʱ���н���ѡ��&&��||
		 * 
		 * �� �ǣ��෴��,���ڵ�Ŀ�����
		 */
		
		/*
		 * �������ʽ����ָ����ֵΪboolean���͵ı��ʽ
		 */
		System.out.println(!(8>6));
		boolean b3=8<6&&6/0<0;
		System.out.println("b3="+b3);
		b3=8<6||6>0;
		System.out.println("b3="+b3);
	}

}
