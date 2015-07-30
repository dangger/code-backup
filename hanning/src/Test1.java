//此程序要求用户输入两个整数，然后计算输入他们的和。
import javax.swing.JOptionPane;//注意此语句也是程序的必要语句，表示引入类库中的类JOptionPane
public class Test1 {

	public static void main(String[] args) {
		String num1;
		String num2;
		
		int n1;
		int n2;
		int add;
		//读取用户输入的第一个整数（读取过来默认是String类型），用变量num1保存
		num1 = JOptionPane.showInputDialog("请输入第一个整数：");
		
		//读取用户输入的第二个整数（读取过来默认是String类型），用变量num2保存
		num2 = JOptionPane.showInputDialog("请输入第二个整数：");
		
		//把字符串类型的num1,num2分别转换为int类型的n1,n2
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);
		
		add = n1 + n2;//计算n1和n2的和
		
		//显示结果
		JOptionPane.showMessageDialog(null, n1 + "与" + n2 +"的和是：" + add);
		
		
	}

	
}

