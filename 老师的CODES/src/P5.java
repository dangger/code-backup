import javax.swing.JOptionPane;


public class P5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("������һ����ݣ�");
		String s2=JOptionPane.showInputDialog("������һ���·ݣ�");
		
		int year=Integer.parseInt(s1);
		int month=Integer.parseInt(s2);
		
		//�ж��ַ����Ƿ���Ȳ�Ҫʹ��"=="
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			System.out.println(year+"��"+month+"����31�죡");
		}else if(month==4||month==6||month==9||month==11){
			System.out.println(year+"��"+month+"����30�죡");
		}else if(month==2){
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+"��"+month+"����29�죡");
			}else{
				System.out.println(year+"��"+month+"����28�죡");
			}
		}else{
			System.out.println(month+"���ǲ���ȷ���·ݣ�");
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"��"+month+"����31�죡");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"��"+month+"����30�죡");
			break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+"��"+month+"����29�죡");
			}else{
				System.out.println(year+"��"+month+"����28�죡");
			}
		default:
			System.out.println(month+"���ǲ���ȷ���·ݣ�");
		}		
	}

}
