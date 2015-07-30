import java.text.DecimalFormat;


public class UseArrayDemo1 {
	public static void main(String[] args) {
		//一个骰子只要投掷的次数足够多，出现1~6点的概率应该基本是均等的。
		
		//0.0<=Math.random()<1.0		
		//(int)(Math.random()*6)+1  1~6  (0~5)+1
		
		//n~m (0~m-n)+n
		//(int)(Math.random()*(m-n+1))+n
		
		
		int f[]=new int[7];
		/*
		 * f[0]不用
		 * f[1]  代表1点出现的次数
		 * f[2]  代表2点出现的次数
		 * f[3]  代表3点出现的次数
		 * ....
		 * f[6]  代表6点出现的次数
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
		
		
		System.out.println("点数"+"    出现的次数"+"    概率");
		for(int i=1;i<f.length;i++){
			String s=decimalFormat.format((double)f[i]/1200);
			System.out.println(i+"      "+f[i]+"    "+s+"%");
		}	
		
	}

}
