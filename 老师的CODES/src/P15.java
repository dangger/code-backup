import javax.swing.JOptionPane;


public class P15 {

	public static String reverse2(String s){
		String r="";
		for (int i = s.length()-1; i >=0; i--) {
			r=r+s.charAt(i);			
		}
		return r;		
	}
	
	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		reverse(str);
		
		String str2=reverse2(str);
		System.out.println(str2);
		
	}
	
	public static void reverse(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

}
