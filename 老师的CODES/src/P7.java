
public class P7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1+3+5+7+9+...+97+99
		
		/*
	 	int i=1;
		int p=1;
		int sum=0;
		while(i<=50){			
			p=p+2;
			sum=sum+p;			
			i++;			
		}		
		System.out.println(sum);
		*/
		
		/*
		//·½°¸2£º
		int i=1;
		int sum=0;
		while(i<=100){
			sum=sum+i;//sum+=i;
			i+=2;//i=i+2;
		}
		System.out.println(sum);
		*/
		
		int i=1;
		int sum=0;
		while(i<=100){
			if(i%2!=0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
