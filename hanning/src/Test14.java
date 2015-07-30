import javax.swing.JOptionPane;

public class Test14 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("ÇëÊäÈëa");
		String s2 = JOptionPane.showInputDialog("ÇëÊäÈëb");
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = max(a, b);
		System.out.println(c);

	}

	private static int max(int a, int b) {
		if (a > b) {
			return a;
		} else
			return b;
	}

}
