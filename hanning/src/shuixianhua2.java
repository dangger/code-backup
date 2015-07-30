public class shuixianhua2 {
	public static void main(String[] args)
	{
		for(int i=100;i<=999;i++)
		{
			int ge,shi,bai;
			bai=i/100;
			shi=(i-bai*100)/10;
			ge=i-bai*100-shi*10;
			if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai)//这里不能加; 否则会出问题 2014年11月4日
			{
				System.out.println(i);
			}
		}
		
	}

}
