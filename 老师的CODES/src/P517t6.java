

import javax.swing.JOptionPane;

public class P517t6 {
	public static void main(String[] args){
		//1�� ��ȡ����
		String n1="Java����ѧϰ��20070336";
		int l=0;
		for(int u=0;u<n1.length();u++){
			if(n1.charAt(u)=='0'||n1.charAt(u)=='1'||n1.charAt(u)=='2'||n1.charAt(u)=='3'
					||n1.charAt(u)=='4'||n1.charAt(u)=='5'||n1.charAt(u)=='6'||n1.charAt(u)=='7'
					||n1.charAt(u)=='8'||n1.charAt(u)=='9'){
				l++;
			}}char n11[]=new char[l];
			l=0;
			for(int u=0;u<n1.length();u++){
				if(n1.charAt(u)=='0'||n1.charAt(u)=='1'||n1.charAt(u)=='2'||n1.charAt(u)=='3'
						||n1.charAt(u)=='4'||n1.charAt(u)=='5'||n1.charAt(u)=='6'||n1.charAt(u)=='7'
						||n1.charAt(u)=='8'||n1.charAt(u)=='9'){
					n11[l]=n1.charAt(u);
					l++;}
				}System.out.print("��һ��");
			for(int p=0;p<l;p++){
				System.out.print(n11[p]);
			}//2��  ��JAVAת��ΪJ2EE
			//��Ⱑ ��Ⱑ 
/*		String n2="MLDNJAVA";;
		for(int u=0;u<n2.length();u++){
			if(n2.charAt(u)=='J'||n2.charAt(u)=='j'){
				if(n2.charAt(u+1)=='A'||n2.charAt(u+1)=='a'){
					if(n2.charAt(u+2)=='V'||n2.charAt(u+2)=='v'){
						if(n2.charAt(u+3)=='A'||n2.charAt(u+3)=='a'){
							String n21=n2.replace(""+n2.charAt(u),"J");String n22=n21.replace(""+n21.charAt(u+1),"E");
							String n23=n22.replace(""+n22.charAt(u+2),"2");String n24=n23.replace(""+n23.charAt(u+3),"2");
							JOptionPane.showMessageDialog(null, n24);
						}else{continue;}
					}else{continue;}
				}else{continue;}
			}else{continue;}
			}*/
			String n21="MLDNJAVAMLGBJAVA";
			String n212=n21.replaceAll("JAVA", "JE22");
			System.out.print("\n�ڶ��⣺"+n212);
			//3�������8���ַ�
			String n3="Java����ѧϰ��20070336";
			char n33=n3.charAt(8);
			System.out.println("\n�����⣺"+n33);
			//4�����0
			String n4="Java����ѧϰ��20070336";
			n4=n4.replaceAll("0", "");
			System.out.println("��4��"+n4);
			//5������ո�
			String n5="Jav a����ѧ ϰ��2007 0336 MLDN ��ʦ";
			String n55=n5.replaceAll(" ", "");//Ϊʲôn5.replaceAll(" ","");Ϊ����
			System.out.println("��5��"+n55);
			//6���������
			String n6=JOptionPane.showInputDialog("���������֤��");
			n6=n6.substring(6,14);
			String N=n6.substring(0,4);
			String Y=n6.substring(4,6);
			String R=n6.substring(6,8);
			int ��=Integer.parseInt(N);
			int ��=Integer.parseInt(Y);
			int ��=Integer.parseInt(R);
			JOptionPane.showMessageDialog(null, "����������"+��+"��"+��+"��"+��+"��");
	
	
	
	}

		
	
}
