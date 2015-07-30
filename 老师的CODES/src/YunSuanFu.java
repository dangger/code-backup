
public class YunSuanFu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10,m=3;
		//n%=m;//n=n%m;
		//System.out.println(n);
		int k=n+m;
		System.out.println(k);
		k=n/m;
		System.out.println(k);
		k=n%m;//求n除以m的余数（模数），n叫做被模数，m叫做模数
		System.out.println(k);
		//%判断一个数能否被另外一个数整除
		
		/*
		 * ++,--运算符可以用在变量之前，也可以用在变量之后，注意这两个只能用在变量上，不能用在常量或表达式上。
		 * 在表达式中，++用在变量之后，表示先使用变量的值，然后再加1
		 *          ++用在变量之前，表示先加1，然后再使用变量的值
		 */
		int x=5;
		x++;//x=x+1;
		System.out.println(x);
		++x;//x=x+1;
		System.out.println(x);		
		
		
		int z=10;
		int a=z++*5;
		System.out.println("a="+a+" z="+z);
		int b=++z*5;
		System.out.println("b="+b+" z="+z);
		
		final int y=8;
		//y++;//错误
		//(x+1)++;//错误
		
		/*
		 * 关系（比较）运算符，使用了关系运算符的表达式称作关系表达式，关系表达式返回boolean类型的值
		 */
		n=1;
		m=3;
		boolean b2=n>m;
		System.out.println("b2="+b2);
		System.out.println(6>=6);
		System.out.println(6<=6);
		System.out.println(n==m);//切记，判断是否相等不能写成一个=
		System.out.println(n!=m);
		
		/*
		 * 逻辑运算符(只有boolean类型才能进行逻辑运算)
		 * &，&&  |，||都属于双目运算符
		 * &，&& 与运算，运算规则：只有两端都为true，最终才是true
		 * |，|| 或运算，运算规则：两端只要有一个为true，最终就是true
		 * 
		 * &与&&的区别：如果前端是false,最终肯定就是false；如果使用&，则后端依然要进行运算；如果使用&&，则后端不再进行运算；
		 * |与||的区别：如果前端是true,最终肯定就是true；如果使用|，则后端依然要进行运算；如果使用||，则后端不再进行运算；
		 * 
		 * 实际编程中建议选用&&和||
		 * 
		 * ！ 非（相反）,属于单目运算符
		 */
		
		/*
		 * 布尔表达式：是指返回值为boolean类型的表达式
		 */
		System.out.println(!(8>6));
		boolean b3=8<6&&6/0<0;
		System.out.println("b3="+b3);
		b3=8<6||6>0;
		System.out.println("b3="+b3);
	}

}
