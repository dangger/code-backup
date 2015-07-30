
import javax.swing.JOptionPane;

public class 媳妇作业 {
	private int m;
	private int n;
	public 媳妇作业(int m,int n){
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
		System.out.print(" 数组1: "+arr1[i]);
		System.out.print(" 数组2: "+arr2[i]);
		}
	}
	public static void main(String[] args){
		String n1=JOptionPane.showInputDialog("您要输入多少个数字");
		int s1=Integer.parseInt(n1);
		String n2=JOptionPane.showInputDialog("您后几位想扔到前边");
		int s2=Integer.parseInt(n2);
		int shuzu[]=new int[s1];
		for(int i=0;i<s1;i++){
			String si=JOptionPane.showInputDialog("请输入数把");
			int di=Integer.parseInt(si);
			shuzu[i]=di;}
		int shuzu2[]=new int[s1];
		媳妇作业 xfzy=new 媳妇作业(s2,s1);
		xfzy.paixu(shuzu, shuzu2);
	

		
		
		
	}
	



}
