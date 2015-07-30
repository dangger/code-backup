
public class WhileDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1!+2!+3!+...+9!+10!
		
		
		/*
		 * 求一个有规律的若干项的和：
		 * 基本思想：每次循环求出当前项，然后把它累加到sum上
		 * 
		 * 式子有多少项，循环就多少次
		 * 循环体中第一项任务就是求出当前这一项(找到一个表达式表示式子中后一项同前一项之间的关系，注意表达式中前后两项用一个变量来表示)
		 * 然后把它累加到sum上
		 */
		
		int i=1;
		int p=1;
		int sum=0;
		while(i<=10){
			p=p*i;
			i++;
			sum=sum+p;
		}
		System.out.println(sum);

	}

}
