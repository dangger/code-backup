import javax.swing.JOptionPane;
	public class Test5 {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	String s1 = JOptionPane.showInputDialog("���������");
		String s2 = JOptionPane.showInputDialog("�������·�");
		
		int year = Integer.parseInt(s1);
		int month = Integer.parseInt(s2);
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)  
        {  
            System.out.println(year+"��"+month+"����31��");  
        }  
        else if(month==4||month==6||month==9||month==11)  
        {  
            System.out.println(year+"��"+month+"����30��");  
        }  
        else  
        {  
            if(year % 4 == 0 && year % 100 != 0)  
            {  
                System.out.println(year+"��"+month+"����28��");  
            }  
            else  
            {  
                System.out.println(year+"��"+month+"����29��");  
            }  
        }  
     }  
}  