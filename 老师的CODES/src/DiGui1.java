
public class DiGui1 {
	
	/*
	 * 在一个方法的方法体中又调用了它自身的方法，叫做递归方法。
	 */
	/*
	 * n!=n*(n-1)!
	 * (n-1)!=(n-1)*(n-2)!
	 * .....
	 * .....
	 * 2!=2*1!
	 * 1!=1//很简单的问题
	 * 
	 * f(n)=n*f(n-1)//归结的公式或过程
	 * f(1)=1//最终归结结束的条件
	 */
	public static long f(int n){
		if(n==1){//先描述递归结束的条件
			return 1;
		}else{
			return n*f(n-1);//递归的公式或过程
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
	public static long f(int n){//求n!
		//1*2*3*。。。*n
		long r=1;
		for(int i=1;i<=n;i++){
			r=r*i;
		}
		return r;
	}
	*/
}
