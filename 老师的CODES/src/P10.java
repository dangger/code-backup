
public class P10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=0;//¼ÆÊý
		for(int i=1;i<=500;i++){
			if(i%3==0&&i%6==0){
				n++;
				System.out.print(i+" ");
				if(n%10==0)
					System.out.println();//»»ÐÐ
			}
		}
	}

}
