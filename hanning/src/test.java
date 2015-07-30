
public class test {

	public static void main(String[] args) {
	for(int a = 1;a <10;a++){
		for(int b = 0;b <10;b++){
			for (int c = 0; c < 10; c++) {
				for (int d = 0; d < 10; d++) {
					if (a+c==b*d) {
						System.out.println(1000*a+100*b+10*c+d);
					}
				}
			}
		}
	}

	}

}
