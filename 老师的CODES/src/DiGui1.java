
public class DiGui1 {
	
	/*
	 * ��һ�������ķ��������ֵ�����������ķ����������ݹ鷽����
	 */
	/*
	 * n!=n*(n-1)!
	 * (n-1)!=(n-1)*(n-2)!
	 * .....
	 * .....
	 * 2!=2*1!
	 * 1!=1//�ܼ򵥵�����
	 * 
	 * f(n)=n*f(n-1)//���Ĺ�ʽ�����
	 * f(1)=1//���չ�����������
	 */
	public static long f(int n){
		if(n==1){//�������ݹ����������
			return 1;
		}else{
			return n*f(n-1);//�ݹ�Ĺ�ʽ�����
		}
	}
	
	public static void main(String[] args) {
		System.out.println(f(3));
		/*
		 * f(3)
		 * 3*f(2)
		 *   2*f(1)
		 *      1
		 */
	}
	
	/*
	public static long f(int n){//��n!
		//1*2*3*������*n
		long r=1;
		for(int i=1;i<=n;i++){
			r=r*i;
		}
		return r;
	}
	*/
}
