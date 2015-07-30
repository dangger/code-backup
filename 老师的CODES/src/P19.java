
public class P19 {
	
	//3.2 3 3.6 4
	//-2.3 -2 -3.6 -4
	public static int round(double n){
		if(n>=0){
			if(n-(int)n>=0.5){
				return (int)n+1;
			}else{
				return (int)n;
			}
		}else{
			if((n-(int)n)>=-0.5){
				return (int)n;
			}else{
				return (int)n-1;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(P19.round(3.9));
		System.out.println(P19.round(3.2));
		System.out.println(P19.round(0.2));
		System.out.println(P19.round(0.8));
		System.out.println(P19.round(-0.2));
		System.out.println(P19.round(-0.8));
		System.out.println(P19.round(-3.9));
		System.out.println(P19.round(-3.2));
		System.out.println(P19.round(0.0));
		
	}

}
