import javax.swing.JOptionPane;


public class P22 {
	
	//�÷������ڽ�����num������/ż���ּ����������У�Ȼ��������ż���������
	public static void output(int num[]){
		int oddNum[];//��������
		int evenNum[];//ż������
		
		int oddCount=0,evenCount=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}//ѭ������ʱ�Ѿ�֪����������ΪoddCount,ż������ΪevenCount
		
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
		}//��ʱ���Ѿ����������num�ֵ���������oddNum��ż������evenNum
		
		//{1,3} {2,4,6,8}
		if(evenNum.length>oddNum.length){//���ż�������϶�
			for (int i = 0; i <=oddNum.length-1; i++) {
				System.out.print(oddNum[i]+" "+evenNum[i]+" ");
			}//�Ȱ��������ĸ����������
			for(int i=oddNum.length;i<=evenNum.length-1;i++){
				System.out.print(evenNum[i]+" ");
			}//�����ʣ�µ�ż��
		}else{
			for (int i = 0; i <= evenNum.length-1; i++) {
				System.out.print(oddNum[i]+" "+evenNum[i]+" ");
			}//�Ȱ���ż���ĸ����������
			for(int i=evenNum.length;i<=oddNum.length-1;i++){
				System.out.print(oddNum[i]+" ");
			}//�����ʣ�µ�����
		}
		
	}
	
	public static void main(String[] args) {
		/*
		int n[]=new int[8];
		for (int i = 0; i < n.length; i++) {
			String s=JOptionPane.showInputDialog("�������"+(i+1)+"��������");
			n[i]=Integer.parseInt(s);			
		}
		*/
		int n[]={1,3,5,0,2,4,6,8};
		output(n);
		
	}

}
