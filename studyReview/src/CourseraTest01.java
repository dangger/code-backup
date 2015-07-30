public class CourseraTest01 {
	public static void main(String[] args) {
		int temp,i;
		int  year1=0;
		int year2;
		while (year1<9999) {
			year2=myReserve(year1);
			int[] char1;
			char1.toCharArray(year2);
			for(i=0;i<char1.length;i++)
		    {
		        if(char1[i]=='6')
		        {
		        	char1[i]='9';
		        }
		        else if(char1[i]=='9')
		        {
		        	char1[i]='6';
		        }
		    }

			temp=year1-year2;
			year1++;
			while(temp==330)
				System.out.println(year1);
		}

	}
	private static char toCharArray(int year2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static int myReserve(int year1){  
	    int tempNum=year1,count,result=0;  
	    for(count=0;tempNum>0;tempNum/=10,count++);//算出该数有多少位  
	  
	    while(year1>0){  
	        int num=year1%10;//取出该位上的数.  
	        for(int i=1;i<count;i++){//count标识当前正在处理第几位数.  
	            num*=10;  
	        }  
	        count--;//标识向前移一位.  
	        result+=num;  
	        year1/=10;//切掉处理过的位数.  
	    };  
	    return result;  
	}  

}
