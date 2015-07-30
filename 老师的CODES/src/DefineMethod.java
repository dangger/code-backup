
public class DefineMethod {
	
	/*
	 * public static 返回值的类型  方法的名字(参数1类型 参数1名字,参数2类型 参数2名字，......){
	 * 		//完成方法功能的语句
	 * 		[return 相应类型的值;]
	 * }
	 * 
	 * 1、记住目前来讲方法都带上修饰符public static
	 * 2、方法的返回值的类型要根据方法的功能来确定，如果不需要返回任何值，返回值的类型不能省去，写成void即可;
	 * 如果需要返回值，要考虑好返回什么类型的值，“返回值的类型”处写成该类型
	 * 3、方法的名字通常使用代表方法功能的英文单词，首字母小写
	 * 4、方法名后面要跟上一对（），如果该方法不需要任何参数，（）中什么也不写，（）不能省去；
	 * 如果该方法需要参数，要在（）中逐一列举各个参数的类型和名字,参数间以“,”隔开
	 * 
	 * 1~4写好了方法头
	 * 
	 * 5、方法头后面要跟上一对{ }，表示方法体
	 * 6、在方法体中首先写上完成方法功能的语句
	 * 7、return的使用：如果该方法的返回值的类型是void,return可以不写，写的话return直接跟上";"
	 * 如果该方法的返回值的类型不是void,一定要通过return返回相应类型的值。
	 * return本质上的作用除了用来返回一个值外，在方法体中碰到return，该方法立即结束，返回到调用该方法的地方。
	 */
	
	/*
	 * 定义一个方法求两个int整数的和
	 */
	public static int add(int a,int b){
		//int c=a+b;
		return a+b;
	}
	
	public static void main(String[] args) {
		//调用方法的时候要满足"虚（形参）实(实参)结合三一致"的原则,也就是说实参要跟形参个数、类型、顺序三一致
		
		//如果一个方法有返回值，通常调用该方法可以赋值给相应类型的变量，可以参与运算，可以拿来输出
		int n=add(5,6);
		int k=add(8,9)+5;
		System.out.println(add(87,96));
		
		if(isOushu(k)){
			System.out.println(k+"是偶数！");
		}else{
			System.out.println(k+"不是偶数！");
		}
		
		//如果一个方法没有返回值，通常调用该方法的语句是一条独立的语句;不能赋值给变量，不能参与运算，不能拿来输出
		printMinus();
		//System.out.println(printMinus());//错误的
	}
	
	public static boolean isOushu(int x){
		if(x%2==0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void printMinus(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		return;//可以省去
	}
	
	

}
