
public class TwoDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][];//��ά����
		double[][] d;
		
		
		a=new int[3][4];//3��4�У���һά�ĳ�����3���ڶ�ά�ȳ�������4
		//��ά�����һά�͵ڶ�ά���±궼��0��ʼ
				
		for(int i=0;i<a.length;i++){//a.length���ص�һά�ĳ��ȣ��������Ϊ����
			for(int j=0;j<a[i].length;j++){//a[i].length���ص�i�еĳ��ȣ��������Ϊ��i���м���Ԫ��
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//ע���ά����ĵڶ�ά�����ǲ��ȳ���
		d=new double[2][];//�ȳ�ʼ����һά�ĳ���
		d[0]=new double[3];//����һ�еĳ��ȳ�ʼ��Ϊ3
		d[1]=new double[4];//���ڶ��еĳ��ȳ�ʼ��Ϊ4
		
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
