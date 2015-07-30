import javax.swing.JOptionPane;


public class P5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("请输入一个年份：");
		String s2=JOptionPane.showInputDialog("请输入一个月份：");
		
		int year=Integer.parseInt(s1);
		int month=Integer.parseInt(s2);
		
		//判断字符串是否相等不要使用"=="
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			System.out.println(year+"年"+month+"月有31天！");
		}else if(month==4||month==6||month==9||month==11){
			System.out.println(year+"年"+month+"月有30天！");
		}else if(month==2){
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+"年"+month+"月有29天！");
			}else{
				System.out.println(year+"年"+month+"月有28天！");
			}
		}else{
			System.out.println(month+"月是不正确的月份！");
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+month+"月有31天！");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"年"+month+"月有30天！");
			break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+"年"+month+"月有29天！");
			}else{
				System.out.println(year+"年"+month+"月有28天！");
			}
		default:
			System.out.println(month+"月是不正确的月份！");
		}		
	}

}
