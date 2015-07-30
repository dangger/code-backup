
public class SwitchDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char grade='A';
		final char ch1='A';
		switch (grade) {
		case ch1:
			System.out.println("分数>=90");
			break;
		case 'B':
			System.out.println("80<=分数<90");
			break;
		case 'C':			
			System.out.println("70<=分数<80");
			break;
		case 'D':
			System.out.println("60<=分数<70");
			break;
		default:
			System.out.println("分数<60");
			//break;
		}
		
		/*
		 * 注意：每个case最后必须跟上关键字break;每个case后面的值必须是常量或常量值；
		 * 		每个case后面的值不允许重复；每个case后面只能写一个值；
		 * 
		 * switch(变量或表达式){//变量或表达式的值只能是byte、short、int或char类型的；在jdk1.7以后，允许时String类型的
		 * 		case 值1：
		 * 			变量或表达式的值是值1的时候要执行的语句（可以是一句话，也可以是多句话）；
		 * 			break;//跳出switch结构
		 * 		case 值2：
		 * 			变量或表达式的值是值2的时候要执行的语句（可以是一句话，也可以是多句话）；
		 * 			break;
		 * 		case 值3：
		 * 			变量或表达式的值是值3的时候要执行的语句（可以是一句话，也可以是多句话）；
		 * 			break;
		 *      ..........
		 *      default://可选的
		 *      	变量或表达式的值不是前面所有case后的值的时候要执行的语句（可以是一句话，也可以是多句话）；
		 *      	break;//可以省去
		 * }
		 */
		
		int n=11;
		switch (n%2) {
		case 0:
			System.out.println(n+"是一个偶数！");
			break;
		case 1:
			System.out.println(n+"是一个奇数！");
			break;
		}
	}

}
