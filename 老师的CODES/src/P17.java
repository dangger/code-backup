
public class P17 {
	
	//xµÄy´ÎÃİ
	public static int getPower(int x,int y){
		/*
		if(y==1){		
			return x;
		}else{
			return x*getPower(x, y-1);
		}
		*/
		if(y==0){			
			return 1;
		}else{
			return x*getPower(x, y-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(P17.getPower(2, 10));
	}

}
