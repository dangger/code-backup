
public class OrdinalSearch {

	//顺序查找对数组的有序性没有要求，每比较一次把查找的范围缩小1个，但查找的效率比较低
	//n个数的查找成功的平均查找长度：（1+2+3+4+....+n）/n=(1+n)/2
	//n个数的查找不成功的平均查找长度：n
	public static int ordinalSearch(int a[],int key){
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int num[]={7,4,0,6,2,5,1};
		int index=ordinalSearch(num, 5);
		if(index==-1){
			System.out.println("未找到！");
		}else{
			System.out.println("要查找的元素在数组中的下标是"+index);
		}
	}

}
