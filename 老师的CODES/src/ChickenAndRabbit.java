
public class ChickenAndRabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����ͬ��  ������32ֻ�ţ�10��ͷ  �ʼ�����ֻ�����Ӷ���ֻ��
		for(int i=1;i<=10;i++){
			for (int j = 1; j <=8; j++) {
				if(i+j==10&&2*i+4*j==32){
					System.out.println("����"+i+" ���ӣ�"+j);
				}
			}
		}
	}

}
