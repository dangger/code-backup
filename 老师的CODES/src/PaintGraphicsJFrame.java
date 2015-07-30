
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class PaintGraphicsJFrame extends JFrame {
	public PaintGraphicsJFrame(){
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();//读取屏幕的分辨率
		setSize(dimension.width/2,dimension.height/2);//设置窗体的大小
		setLocation(dimension.width/4, dimension.height/4);//设置窗体的位置,期望在屏幕正中间
		setTitle("绘制图形");//设置标题栏的文字
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体的关闭操作（目前是关闭窗体时结束应用程序）
		setVisible(true);//设置窗体可见
	}
	
	//每次窗体在显示出来时都会自动调用该方法	
	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		arg0.setColor(Color.orange);
		Font font1=new Font("隶书", Font.ITALIC+Font.BOLD, 32);
		arg0.setFont(font1);
		arg0.drawString("欢迎来到Java世界！", 100,80);
		
		Color color2=new Color(0, 0, 128);
		arg0.setColor(color2);
		Font font2=new Font("楷体_GB2312", Font.PLAIN, 38);
		arg0.setFont(font2);
		arg0.drawString("欢迎来到Java世界！", 100,120);
		
		Color color3=new Color(0.25f, 0.25f, 0.0f);
		arg0.setColor(color3);
		Font font3=new Font("华文彩云", Font.BOLD, 50);
		arg0.setFont(font3);
		arg0.drawString("欢迎来到Java世界！", 100,170);
	}

	public static void main(String[] args) {
		PaintGraphicsJFrame frame=new PaintGraphicsJFrame();
	}
}
