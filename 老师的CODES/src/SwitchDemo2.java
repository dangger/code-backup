import javax.swing.JOptionPane;


public class SwitchDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("������һ���·ݣ�");
		//Ҫ������·�������ĸ�����
		int month=Integer.parseInt(s);
		switch (month) {
		case 1:
		case 12:
		case 11:
			System.out.println("����");
			break;
		case 2:			
		case 3:			
		case 4:
			System.out.println("����");
			break;
		case 5:			
		case 6:			
		case 7:
			System.out.println("�ļ�");
			break;
		case 8:			
		case 9:			
		case 10:
			System.out.println("�＾");
			break;
		default:
			System.out.println(month+"�²�����ȷ���·ݣ�");
			//break;
		}
	}

}
