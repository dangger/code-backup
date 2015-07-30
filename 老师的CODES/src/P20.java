import java.text.DecimalFormat;


public class P20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score[]={72,89,65,58,87,91,53,82,71,93,76,68};
		int sum=0;
		for(int i=0;i<=score.length-1;i++){//遍历
			sum=sum+score[i];			
		}
		
		double ave=(double)sum/score.length;
		
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		String r=decimalFormat.format(ave);
		
		System.out.println("平均成绩："+r);
	}

}
