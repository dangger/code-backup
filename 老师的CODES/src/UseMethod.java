
public class UseMethod {

	public static int pow(int x,int y){//求x的y次幂，假定x,y都是正整数
		int r=1;
		for(int i=1;i<=y;i++){
			r=r*x;
		}
		return r;
	}
	
	public static void main(String[] args) {
		/*
		 * 对于static(静态，类)方法，通过“类名.方法名”的形式可以调用该方法；如果在方法所在的类中调用，
		 * “类名”可以省去，但是要在类以外来调用，类名不能省去。
		 */
		System.out.println(pow(2, 10));		
		int n=UseMethod.pow(2, 3);
		
		/*
		 * 对于没有static修饰符的（非静态，实例）方法，只能“对象名.方法名”的形式来调用该方法；
		 * 创建对象的格式：类名 对象名=new 类名（）;
		 */	
		
		UseMethod useMethod=new UseMethod();//创建UseMethod类的对象
		System.out.println(useMethod.doubleNum(10));
	}
	
	public int doubleNum(int n){//非静态方法
		return 2*n;
	}

}
