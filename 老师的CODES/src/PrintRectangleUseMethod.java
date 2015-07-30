
public class PrintRectangleUseMethod {

	//方法：通常将程序中完成特定功能的某一段代码定义成方法。特别是在这种功能需要被多次反复使用的时候。
	
	/*
	 * 自定义的方法必须跟main方法是平行的关系，可以放在main之前或之后
	 * 自定义的方法必须放在类的内部，属于类所有
	 */	
	
	
	public static void main(String[] args) {
		printRec(3, 4);//调用方法，3,4称作实际参数（实参）
		printRec(5, 5);
		printRec(8, 10);
	}

	/*
	 * 自定义方法输出*组成的x行，y列的矩形
	 */
	public static void printRec(int x,int y){//x,y称作形式参数（形参），也叫虚拟参数（虚参）
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	
}
