import javax.swing.JOptionPane;
	public class test3 {
		public static void main(String[] args) {
		String n1;
		int year;
		
		n1 = JOptionPane.showInputDialog("���������");
		year = Integer.parseInt(n1);
		
		if (year%4==0&&year%100!=0||year%400==0){
			JOptionPane.showMessageDialog(null, "������");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "��ƽ��");
				}
			}
}