import javax.swing.JOptionPane;

public class Temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n2 = "MLDNJAVA";
		;
		for (int u = 0; u < n2.length(); u++) {
			if (n2.charAt(u) == 'J' || n2.charAt(u) == 'j') {
				if (n2.charAt(u + 1) == 'A' || n2.charAt(u + 1) == 'a') {
					if (n2.charAt(u + 2) == 'V' || n2.charAt(u + 2) == 'v') {
						if (n2.charAt(u + 3) == 'A' || n2.charAt(u + 3) == 'a') {
							String n21 = n2.replace("" + n2.charAt(u), "J");
							System.out.println(n21);
							String n22 = n21.replace("" + n21.charAt(u + 1),
									"2");
							System.out.println(n22);
							String n23 = n22.replace("" + n22.charAt(u + 2),
									"E");
							System.out.println(n23);
							String n24 = n23.replace("" + n23.charAt(u + 3),
									"E");
							System.out.println(n24);
						} else {
							continue;
						}
					} else {
						continue;
					}
				} else {
					continue;
				}
			} else {
				continue;
			}
		}

	}

}
