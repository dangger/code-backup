
public class ForDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1+2+3+4+5+...+99+100
		int sum=0;
		int i;
		for(i=1;i<=100;i++){//for结构头,在for结构头上定义的变量只在for循环中有效；注意i++在循环体执行后才执行
			sum+=i;//sum=sum+i;			
		}
		System.out.println(i);
		System.out.println(sum);
		
		sum=0;
		for(i=100;i>=1;i--){
			sum+=i;
		}
		System.out.println(sum);
		
		//2+6+18+54+162+486
		sum=0;
		for(int j=2;j<=486;j=j*3){
			sum=sum+j;
		}
		System.out.println(sum); 
	}

}
