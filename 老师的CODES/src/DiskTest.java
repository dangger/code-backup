class Disk {//��
	/*
	 * ��Ա���������ԣ�ͨ�������˽�еģ��������ⲻ����ֱ�ӷ��ʡ�
	 * ��������������ȡ��ͨ���Ը����Ի��ṩget������
	 * ��������������޸ģ�ͨ���Ը����Ի��ṩset����,���ҿ��ԵĻ�Ҫ��set�����ڲ����в����ĺϷ��Լ�飻
	 * ������ķ�װ�Ե�һ�����֡�
	 */
	private float size;//��������
	private float used;//���ÿռ�
	
	/*
	 * ���ڶ�ȡ���̵�������ֻ��һ������Ĵ��̶���Ż��о���Ĵ�������ֵ
	 * ��������϶��Ǹ�������ĳ�����̶�����õģ������Ĵ��̶���϶�����
	 * ��ǰ�Ĵ����ഴ���ģ������Ĵ��̶�����϶�����size��used������
	 * ���ԣ���Ա������
	 */
	//һ����get��������Ҫ��������Ҫ����ֵ
	public float getSize(){
		return size;
	}
	//һ����set������Ҫ����������Ҫ����ֵ
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
			return "����ʣ��ռ�Ϊ��"+(size-used);
		}else{
			return "��������";
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
