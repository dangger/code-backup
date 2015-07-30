import javax.swing.JOptionPane;


public class SwitchDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("请输入一个月份：");
		//要求根据月份输出是哪个季节
		int month=Integer.parseInt(s);
		switch (month) {
		case 1:
		case 12:
		case 11:
			System.out.println("冬季");
			break;
		case 2:			
		case 3:			
		case 4:
			System.out.println("春季");
			break;
		case 5:			
		case 6:			
		case 7:
			System.out.println("夏季");
			break;
		case 8:			
		case 9:			
		case 10:
			System.out.println("秋季");
			break;
		default:
			System.out.println(month+"月不是正确的月份！");
			//break;
		}
	}

}
