public class ContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// continueֻ������ѭ���У���ʾԽ��ѭ������continue�����䣬������һ��ѭ��

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;// ������һ��ѭ����sum=sum+i����ִ��
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
