
public class P11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 认真分析可发现:
		 * 1、图形有多少行，外层循环就有多少次
		 * 2、图形的每一行有几部分组成，内层就有几个for循环，每个for循环分别输出图形中每一行的每部分
		 * 3、内层每个for循环的次数需要根据图形每一部分变化的规律来具体分析
		 * 4、内层循环最后加一句System.out.println();
		 * 
		 */
				
		for(int i=1;i<=5;i++){
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=22-4*i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
