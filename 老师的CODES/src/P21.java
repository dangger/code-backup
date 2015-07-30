
public class P21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score[]={72,89,65,58,87,91,53,82,71,93,76,68};
		int count[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			/*
			if(score[i]>=90){
				count[4]++;
			}else if(score[i]>=80){
				count[3]++;
			}else if(score[i]>=70){
				count[2]++;
			}else if(score[i]>=60){
				count[1]++;
			}else{
				count[0]++;
			}
			*/
			if(score[i]<60){
				count[0]++;
			}else{
				count[score[i]/10-5]++;
			}
		}
		
		//char ch[]={'E','D','C','B','A'};
		
		System.out.println("等级        人数");
		for (int i = count.length-1; i >=0; i--) {
			System.out.println((char)(69-i)+"      "+count[i]);
			//System.out.println(ch[i]+"      "+count[i]);
		}
		//i=4   65 A
		//i=3   66 B
		//i=2   67 C
		//i=1   68 D
		//i=0   69 E
		
	}

}
