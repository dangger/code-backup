public class BinarySearch {

	//���֣��۰룩����Ҫ���������������ģ�ÿ�Ƚ�һ�ΰѲ��ҵķ�Χ��С1�룬���ҵ�Ч�ʱȽϸ�
	public static int binarySearch(int data[], int key) {// ���������е�����a�в���key
		int left = 0, right = data.length - 1;// left,rightʼ�մ�������������±����Сֵ�����ֵ

		while (left <= right) {
			int mid = (left + right) / 2;
			if (key < data[mid]) {
				right = mid - 1;// ����һ�εĲ������䶨λ��ǰ�벿��
			}
			if (key > data[mid]) {
				left = mid + 1;// ����һ�εĲ������䶨λ����벿��
			}
			if (key == data[mid]) {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int num[]={4,6,8,9,10,15,25,36,49,50,58,59,87,100};
		int index=binarySearch(num, 30);
		if(index==-1){
			System.out.println("δ�ҵ���");
		}else{
			System.out.println("Ҫ���ҵ�Ԫ���������е��±���"+index);
		}
	}

}
