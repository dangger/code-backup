
public class OverrideDemo {

	/*
	 * 方法的重载(overload)：指的是一个类中存在多个相同名称的方法，但是这些方法的“参数集”必须不同。
	 * 参数集：指参数的个数和类型。
	 * 通常重载的方法具有类似的功能。
	 * 判断方法能否重载的唯一标准就是方法名一样，参数集不同，跟方法的返回值的类型没有关系。
	 * 在调用方法时，系统会根据实参自动选择一个最合适的方法调用。
	 */
	
	public static int add(int x,int y){
		System.out.println("1");
		return x+y;
	}	
	public static double add(double a,double b){
		return a+b;
	}
	public static double add(int a,double b){
		return a+b;
	}
	public static double add(double a,int b){
		return a+b;
	}
	public static int add(int x,int y,int z){
		return x+y+z;
	}
	public static double add(double a,double b,double c){
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(5,6));
		System.out.println(add(5,6.6));	
	}
}
