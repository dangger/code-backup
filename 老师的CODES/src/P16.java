
public class P16 {

	public static int factor(int m,int n){
		int r=m%n;
		while(r!=0){
			m=n;
			n=r;
			r=m%n;			
		}
		return n;
		
	}
	public static void main(String[] args) {
		System.out.println(factor(16, 24));
	}
}
