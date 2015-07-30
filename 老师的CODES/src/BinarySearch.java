public class BinarySearch {

	//二分（折半）查找要求数组必须是有序的，每比较一次把查找的范围缩小1半，查找的效率比较高
	public static int binarySearch(int data[], int key) {// 在升序排列的数组a中查找key
		int left = 0, right = data.length - 1;// left,right始终代表待查找区间下标的最小值和最大值

		while (left <= right) {
			int mid = (left + right) / 2;
			if (key < data[mid]) {
				right = mid - 1;// 把下一次的查找区间定位到前半部分
			}
			if (key > data[mid]) {
				left = mid + 1;// 把下一次的查找区间定位到后半部分
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
			System.out.println("未找到！");
		}else{
			System.out.println("要查找的元素在数组中的下标是"+index);
		}
	}

}
