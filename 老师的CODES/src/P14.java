
public class P14 {

	public static int max(int x,int y){
		/*
		int max;
		if(x>y){
			max=x;
		}else{
			max=y;
		}
		return max;
		*/
		/*
		if(x>y){
			return x;
		}else{
			return y;
		}
		*/
		/*if(x>y){
			return x;
		}
		return y;*/
		return x>y?x:y;
	}
	public static void main(String[] args) {
		int max=max(15, 20);
		System.out.println(max);
		
		System.out.println(max(25,18));
		
		max2(25, 30);
	}
	
	public static void max2(int a,int b){
		if(a>b){
			System.out.println(a);
		}else{
			System.out.println(b);
		}
	}

}


