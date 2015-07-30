import javax.swing.JOptionPane;
	public class test3 {
		public static void main(String[] args) {
		String n1;
		int year;
		
		n1 = JOptionPane.showInputDialog("请输入年份");
		year = Integer.parseInt(n1);
		
		if (year%4==0&&year%100!=0||year%400==0){
			JOptionPane.showMessageDialog(null, "是闰年");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "是平年");
				}
			}
}