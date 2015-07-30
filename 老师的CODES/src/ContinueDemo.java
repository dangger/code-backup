public class ContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// continue只能用在循环中，表示越过循环体中continue后的语句，继续下一次循环

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;// 继续下一次循环，sum=sum+i不再执行
			sum = sum + i;
		}
		System.out.println(sum);

		outer: for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j > i) {
					System.out.println();
					//continue outer;
					break;
				}
				System.out.print((i * j) + " ");
			}
		}
		
		/*for (int i = 1; i < 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}*/
	}

}
