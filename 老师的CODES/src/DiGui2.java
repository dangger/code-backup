
public class DiGui2 {

	//쳲��������У�1,1,2,3,5,8,13,21,34,55,89
	/*
	 * fibo(n)=fibo(n-1)+fibo(n-2)
	 * fibo(n-1)=fibo(n-2)+fibo(n-3)
	 * fibo(n-2)=fibo(n-3)+fibo(n-4) 
	 * ....
	 * ....
	 * fibo(3)=fibo(2)+fibo(1)
	 * fibo(2)=1,fibo(1)=1 //���չ�����������
	 * fibo(n)=fibo(n-1)+fibo(n-2)//���Ĺ�ʽ�����
	 */
	//��쳲��������еĵ�n��	
	public static int fibo(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			System.out.print(fibo2(i)+" ");
		}
	}
	
	public static int fibo2(int n){
		if(n==1||n==2){
			return 1;
		}else{
			int p=1,q=1;
			int r=0;
			for(int i=3;i<=n;i++){
				r=p+q;
				p=q;
				q=r;
			}
			return r;
		}
	}
}
