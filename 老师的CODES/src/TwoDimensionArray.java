
public class TwoDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][];//二维数组
		double[][] d;
		
		
		a=new int[3][4];//3行4列，第一维的长度是3，第二维等长，都是4
		//二维数组第一维和第二维的下标都从0开始
				
		for(int i=0;i<a.length;i++){//a.length返回第一维的长度，可以理解为行数
			for(int j=0;j<a[i].length;j++){//a[i].length返回第i行的长度，可以理解为第i行有几个元素
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//注意二维数组的第二维可以是不等长的
		d=new double[2][];//先初始化第一维的长度
		d[0]=new double[3];//将第一行的长度初始化为3
		d[1]=new double[4];//将第二行的长度初始化为4
		
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				d[i][j]=(i+1)*j;
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		//String[] s[];
		//s=new String[][]{{"qwr","gfj"},{"cb","sdg","hik"},{"bxdd"}};
		String[] s[]={{"qwr","gfj"},{"cb","sdg","hik"},{"bxdd"}};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]+" ");				
			}
			System.out.println();
		}			
		
		int n[][]={{1,2,3,4},{5,6,7}};
		System.out.println(n[1][2]);
	}

}
