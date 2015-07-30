
public class BreakDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * break用在三种场合：
		 * 1、用在switch结构中，每个case后面必须跟上一个break,表示跳出switch结构
		 * 2、用在循环中，表示跳出所在的当前这一层循环
		 * 3、可以用在带标号的语句快中（很少使用）
		 */
		for(int i=3;i<=200;i+=2){
			int j;
			for(j=2;j<=i-1;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i){//说明第15行的循环式正常结束的，没有被跳出来
				System.out.println(i+"是素数！");
			}
			/*
			 * 在第15行这个循环进行时，如果第17行的break从来没有执行过，说明所有的i%j都不等于0，说明i是素数;
			 * 如果第17行的break执行过，说明有i%j等于0，说明i不是素数;
			 * 
			 * 如果break从来没有执行过，那么第15行的循环应该是正常结束的，正常结束的话j的值应该是i
			 * 如果break执行过,那么第15行的循环是被跳出来的，j的值肯定是小于i的
			 */
			
		}
	}

}
