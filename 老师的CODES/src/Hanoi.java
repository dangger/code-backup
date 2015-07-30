
public class Hanoi {
	
	//表示移动n个圆盘从a到c，b做临时的中转
	public static void move(int n,char a,char b,char c){
		if(n==1){
			System.out.println("From "+a+" To "+c);
		}else{
			move(n-1,a,c,b);//表示移动n个圆盘从a到b，c做临时的中转
			System.out.println("From "+a+" To "+c);//移动一个圆盘从a到c
			move(n-1,b,a,c);//表示移动n个圆盘从b到c，a做临时的中转
		}
	}
	public static void main(String[] args) {
		move(3, 'A', 'B', 'C');
	}
}
