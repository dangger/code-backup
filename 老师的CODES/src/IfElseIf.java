
public class IfElseIf {
	/*
	 * 学生的成绩studentGrade>=90分，则输出等级“A”， 
	 * studentGrade>=80分，则输出等级“B”， 
	 * studentGrade>=70分，则输出等级“C”，
	 * studentGrade>=60分，则输出等级“D”，
	 * 其他成绩，则输出等级“F”。
	 */
	public static void main(String[] args) {
		int studentGrade=85;
		
		//多分支
		if(studentGrade>=90){
			System.out.println("等级为A");
		}else if(studentGrade>=80){
			System.out.println("等级为B");
		}else if(studentGrade>=70){
			System.out.println("等级为C");
		}else if(studentGrade>=60){
			System.out.println("等级为D");
		}else{
			System.out.println("等级为F");
		}
		
		/*
		if(studentGrade>=90){
			System.out.println("等级为A");
		}else{
			if(studentGrade>=80){
				System.out.println("等级为B");
			}else{
				if(studentGrade>=70){
					System.out.println("等级为C");
				}else{
					if(studentGrade>=60){
						System.out.println("等级为D");
					}else{
						System.out.println("等级为F");
					}
				}
			}
		}
		*/
	}

}
