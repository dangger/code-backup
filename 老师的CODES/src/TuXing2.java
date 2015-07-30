
public class TuXing2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 *    *
		 * 	  ***
		 * 	  *****
		 *    *******
		 *    *********
		 *    ***********
		 * 
		 */
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 
		 *              *
		 * 	          ***
		 * 	        *****
		 *        *******
		 *      *********
		 *    ***********
		 * 
		 */
		
		for (int i = 1; i <=6; i++) {
			for(int j=1;j<=12-2*i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
