import javax.swing.JOptionPane;


public class P22 {
	
	//该方法用于将数组num按奇数/偶数分拣到两个数组中，然后按奇数、偶数交替输出
	public static void output(int num[]){
		int oddNum[];//奇数数组
		int evenNum[];//偶数数组
		
		int oddCount=0,evenCount=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}//循环结束时已经知道奇数个数为oddCount,偶数个数为evenCount
		
		oddNum=new int[oddCount];
		evenNum=new int[evenCount];
		
		int p=0,q=0;
		
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0){
				evenNum[p]=num[i];
				p++;
			}else{
				oddNum[q]=num[i];
				q++;
			}
		}//此时，已经将大的数组num分到奇数数组oddNum和偶数数组evenNum
		
		//{1,3} {2,4,6,8}
		if(evenNum.length>oddNum.length){//如果偶数个数较多
			for (int i = 0; i <=oddNum.length-1; i++) {
				System.out.print(oddNum[i]+" "+evenNum[i]+" ");
			}//先按照奇数的个数交替输出
			for(int i=oddNum.length;i<=evenNum.length-1;i++){
				System.out.print(evenNum[i]+" ");
			}//再输出剩下的偶数
		}else{
			for (int i = 0; i <= evenNum.length-1; i++) {
				System.out.print(oddNum[i]+" "+evenNum[i]+" ");
			}//先按照偶数的个数交替输出
			for(int i=evenNum.length;i<=oddNum.length-1;i++){
				System.out.print(oddNum[i]+" ");
			}//再输出剩下的奇数
		}
		
	}
	
	public static void main(String[] args) {
		/*
		int n[]=new int[8];
		for (int i = 0; i < n.length; i++) {
			String s=JOptionPane.showInputDialog("请输入第"+(i+1)+"个整数：");
			n[i]=Integer.parseInt(s);			
		}
		*/
		int n[]={1,3,5,0,2,4,6,8};
		output(n);
		
	}

}
