public class NacissusUseFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 求100~999之间的水仙花数
		
		//尝试法
		int m=1;
		for (int n = 100; n <= 999; n++) {
			int b=n/100;//求出百位
			int sh=n%100/10;//求出十位
			int g=n%10;//求出个位
			/*
			if(b*b*b+sh*sh*sh+g*g*g==n){
				System.out.println(n);
			}
			*/
			
			if(Math.pow(b, 3)+Math.pow(sh, 3)+Math.pow(g, 3)==n){
				System.out.println("找到了第"+(m++)+"个水仙花数："+n);
			}
			
		}
		
		

	}

}
