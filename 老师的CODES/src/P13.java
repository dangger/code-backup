
public class P13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int man=1;man<=9;man++){
			for(int women=1;women<=12;women++){
				for(int children=2;children<=36;children+=2){
					if(man+women+children==36&&4*man+3*women+children/2==36){
						System.out.println("男人："+man+" 女人："+women+" 小孩:"+children);
					}
				}
			}
		}
	}

}
