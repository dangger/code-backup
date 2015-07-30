class Disk {//类
	/*
	 * 成员变量（属性）通常定义成私有的，在类以外不允许直接访问。
	 * 如果允许类以外读取，通常对该属性会提供get方法；
	 * 如果允许类以外修改，通常对该属性会提供set方法,并且可以的话要在set方法内部进行参数的合法性检查；
	 * 这是类的封装性的一种体现。
	 */
	private float size;//磁盘容量
	private float used;//已用空间
	
	/*
	 * 用于读取磁盘的容量，只有一个具体的磁盘对象才会有具体的磁盘容量值
	 * 这个方法肯定是给将来的某个磁盘对象调用的，将来的磁盘对象肯定是由
	 * 当前的磁盘类创建的，将来的磁盘对象本身肯定包含size和used这两个
	 * 属性（成员变量）
	 */
	//一般上get方法不需要参数，需要返回值
	public float getSize(){
		return size;
	}
	//一般上set方法需要参数，不需要返回值
	public void setSize(float s){
		if(s>0){
			size=s;
		}			
	}
	
	public float getUsed(){
		return used;
	}
	
	public void setUsed(float u){
		if(u>=0&&u<=size){
			used=u;
		}
	}
	
	public String getAvaiable(){
		if(used<size){
			return "磁盘剩余空间为："+(size-used);
		}else{
			return "磁盘已满";
		}
	}	
}
public class DiskTest {

	public static void main(String[] args) {
		Disk disk1=new Disk();
		System.out.println(disk1.getSize());
		System.out.println(disk1.getUsed());
		//disk1.size=-100;
		disk1.setSize(-100);
		disk1.setUsed(80);
		System.out.println(disk1.getAvaiable());
		
		Disk disk2=new Disk();
		disk2.setSize(90.56f);
		disk2.setUsed(25.8f);
		System.out.println(disk2.getAvaiable());		
	}
}
