
import javax.swing.JOptionPane;

public class ϱ����ҵ {
	private int m;
	private int n;
	public ϱ����ҵ(int m,int n){
		this.m=m;
		this.n=n;}
	public void paixu(int[] arr1,int[] arr2){
		arr1=new int[m];
		arr2=new int[m];
		int l=0;
		int p=0;
		for(int i=n-m;i<n;i++){
			p=arr1[i];
			arr2[l]=p;l++;}
		l=0;
		for(int i=m;i<n;i++){
			p=arr1[l];
			arr2[i]=p;l++;}
		for(int i=0;i<n;i++){
		System.out.print(" ����1: "+arr1[i]);
		System.out.print(" ����2: "+arr2[i]);
		}
	}
	public static void main(String[] args){
		String n1=JOptionPane.showInputDialog("��Ҫ������ٸ�����");
		int s1=Integer.parseInt(n1);
		String n2=JOptionPane.showInputDialog("����λ���ӵ�ǰ��");
		int s2=Integer.parseInt(n2);
		int shuzu[]=new int[s1];
		for(int i=0;i<s1;i++){
			String si=JOptionPane.showInputDialog("����������");
			int di=Integer.parseInt(si);
			shuzu[i]=di;}
		int shuzu2[]=new int[s1];
		ϱ����ҵ xfzy=new ϱ����ҵ(s2,s1);
		xfzy.paixu(shuzu, shuzu2);
	

		
		
		
	}
	



}
