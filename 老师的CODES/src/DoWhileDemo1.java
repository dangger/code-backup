import javax.swing.JOptionPane;


public class DoWhileDemo1 {
	public static void main(String[] args) {
		/*
		 * while循环称作当型循环，判断条件在先
		 * do..while循环称作直到型循环，判断条件在后
		 * while循环的循环体最少执行0次
		 * do..while的循环体最少执行1次
		 */
		
		/*
		 * 变量的作用域：指变量的有效范围，从定义它的地方开始，到所在的语句块({}括住的语句)结束
		 */	
		
		
		//把用户输入的整数累加求和，输入0停止
		int sum=0;
		int n;
		/*do{
			String s=JOptionPane.showInputDialog("请输入整数累加求和(输入0停止)：");
			n=Integer.parseInt(s);			
			sum=sum+n;
		}while(n!=0);
		*/
		String s=JOptionPane.showInputDialog("请输入整数累加求和(输入0停止)：");
		n=Integer.parseInt(s);
		while(n!=0){
			sum=sum+n;
			s=JOptionPane.showInputDialog("请输入整数累加求和(输入0停止)：");
			n=Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
