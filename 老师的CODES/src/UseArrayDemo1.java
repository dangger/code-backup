import java.text.DecimalFormat;


public class UseArrayDemo1 {
	public static void main(String[] args) {
		//һ������ֻҪͶ���Ĵ����㹻�࣬����1~6��ĸ���Ӧ�û����Ǿ��ȵġ�
		
		//0.0<=Math.random()<1.0		
		//(int)(Math.random()*6)+1  1~6  (0~5)+1
		
		//n~m (0~m-n)+n
		//(int)(Math.random()*(m-n+1))+n
		
		
		int f[]=new int[7];
		/*
		 * f[0]����
		 * f[1]  ����1����ֵĴ���
		 * f[2]  ����2����ֵĴ���
		 * f[3]  ����3����ֵĴ���
		 * ....
		 * f[6]  ����6����ֵĴ���
		 */
		for(int i=1;i<=120000;i++){
			f[(int)(Math.random()*6)+1]++;
			/*int dianshu=(int)(Math.random()*6)+1;
			if(dianshu==1){
				f[1]++;
			}
			if(dianshu==2){
				f[2]++;
			}
			if(dianshu==3){
				f[3]++;
			}
			if(dianshu==4){
				f[4]++;
			}
			if(dianshu==5){
				f[5]++;
			}
			if(dianshu==6){
				f[6]++;
			}*/	
		}
		
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		
		
		System.out.println("����"+"    ���ֵĴ���"+"    ����");
		for(int i=1;i<f.length;i++){
			String s=decimalFormat.format((double)f[i]/1200);
			System.out.println(i+"      "+f[i]+"    "+s+"%");
		}	
		
	}

}
