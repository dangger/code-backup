
public class ChickenAndRabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 鸡兔同笼  笼子中32只脚，10个头  问鸡多少只？兔子多少只？
		for(int i=1;i<=10;i++){
			for (int j = 1; j <=8; j++) {
				if(i+j==10&&2*i+4*j==32){
					System.out.println("鸡："+i+" 兔子："+j);
				}
			}
		}
	}

}
