
public class P18 {

	public static int gcd(int x,int y){
		if(y==0){
			return x;
		}else{
			return gcd(y,x%y);
		}
	}
	public static void main(String[] args) {
		System.out.println(P18.gcd(16, 24));
	}

}
