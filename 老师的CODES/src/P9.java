import javax.swing.JOptionPane;


public class P9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("������һ����Ȼ����");
		int n=Integer.parseInt(s);
		System.out.print(n+" ");
		do{
			if(n%2==1){
				n=n*3+1;
			}else{
				n=n/2;
			}
			System.out.print(n+" ");
		}while(n!=1);
	}
}
