import javax.swing.JOptionPane;


public class P3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("请输入一个年份：");	
		int year=Integer.parseInt(s);
		//(year%4==0&&year%100!=0)||(year%400==0)是true,((year%4==0&&year%100!=0)||(year%400==0))==true还是true
		//(year%4==0&&year%100!=0)||(year%400==0)是false,((year%4==0&&year%100!=0)||(year%400==0))==true还是false
		if((year%4==0&&year%100!=0)||(year%400==0)){
			System.out.println(year+"年是闰年！");
		}else{
			System.out.println(year+"年是平年！");
		}
		
		String r=(year%4==0&&year%100!=0)||(year%400==0)?year+"年是闰年！":year+"年是平年！";
		System.out.println(r);		
	}
}
