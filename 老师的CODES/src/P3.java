import javax.swing.JOptionPane;


public class P3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("������һ����ݣ�");	
		int year=Integer.parseInt(s);
		//(year%4==0&&year%100!=0)||(year%400==0)��true,((year%4==0&&year%100!=0)||(year%400==0))==true����true
		//(year%4==0&&year%100!=0)||(year%400==0)��false,((year%4==0&&year%100!=0)||(year%400==0))==true����false
		if((year%4==0&&year%100!=0)||(year%400==0)){
			System.out.println(year+"�������꣡");
		}else{
			System.out.println(year+"����ƽ�꣡");
		}
		
		String r=(year%4==0&&year%100!=0)||(year%400==0)?year+"�������꣡":year+"����ƽ�꣡";
		System.out.println(r);		
	}
}
