
public class IfElseIf {
	/*
	 * ѧ���ĳɼ�studentGrade>=90�֣�������ȼ���A���� 
	 * studentGrade>=80�֣�������ȼ���B���� 
	 * studentGrade>=70�֣�������ȼ���C����
	 * studentGrade>=60�֣�������ȼ���D����
	 * �����ɼ���������ȼ���F����
	 */
	public static void main(String[] args) {
		int studentGrade=85;
		
		//���֧
		if(studentGrade>=90){
			System.out.println("�ȼ�ΪA");
		}else if(studentGrade>=80){
			System.out.println("�ȼ�ΪB");
		}else if(studentGrade>=70){
			System.out.println("�ȼ�ΪC");
		}else if(studentGrade>=60){
			System.out.println("�ȼ�ΪD");
		}else{
			System.out.println("�ȼ�ΪF");
		}
		
		/*
		if(studentGrade>=90){
			System.out.println("�ȼ�ΪA");
		}else{
			if(studentGrade>=80){
				System.out.println("�ȼ�ΪB");
			}else{
				if(studentGrade>=70){
					System.out.println("�ȼ�ΪC");
				}else{
					if(studentGrade>=60){
						System.out.println("�ȼ�ΪD");
					}else{
						System.out.println("�ȼ�ΪF");
					}
				}
			}
		}
		*/
	}

}
