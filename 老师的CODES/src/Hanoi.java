
public class Hanoi {
	
	//��ʾ�ƶ�n��Բ�̴�a��c��b����ʱ����ת
	public static void move(int n,char a,char b,char c){
		if(n==1){
			System.out.println("From "+a+" To "+c);
		}else{
			move(n-1,a,c,b);//��ʾ�ƶ�n��Բ�̴�a��b��c����ʱ����ת
			System.out.println("From "+a+" To "+c);//�ƶ�һ��Բ�̴�a��c
			move(n-1,b,a,c);//��ʾ�ƶ�n��Բ�̴�b��c��a����ʱ����ת
		}
	}
	public static void main(String[] args) {
		move(3, 'A', 'B', 'C');
	}
}
