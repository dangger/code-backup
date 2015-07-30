import javax.swing.JOptionPane;


public class P6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("请输入一个分数（1~100）");
		int score=Integer.parseInt(s);
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;		
		default:
			System.out.println("F");
		}
	}

}
