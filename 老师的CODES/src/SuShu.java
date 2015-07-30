
public class SuShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//要求编程输出3~200内所有的素数。素数指只能够被1和他本身整数的整数。
		/*
		输出不是素数的数
		for (int i = 3; i <=200; i++) {
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					System.out.println(i+"不是素数！");
					break;//跳出所在的循环
				}
			}
		}
		*/
		for (int i = 3; i <=200; i+=2) {
			boolean is=true;//设立一个标记
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					is=false;//说明i除以2~i-1的过程中有能整除的
					break;
				}
			}
			if(is==true){//is==true成立的话，说明说明i除以2~i-1的过程中没有能整除的
				System.out.println(i+"是素数！");
			}
		}

	}

}
