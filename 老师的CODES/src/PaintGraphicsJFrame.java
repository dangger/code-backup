
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class PaintGraphicsJFrame extends JFrame {
	public PaintGraphicsJFrame(){
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();//��ȡ��Ļ�ķֱ���
		setSize(dimension.width/2,dimension.height/2);//���ô���Ĵ�С
		setLocation(dimension.width/4, dimension.height/4);//���ô����λ��,��������Ļ���м�
		setTitle("����ͼ��");//���ñ�����������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ô���Ĺرղ�����Ŀǰ�ǹرմ���ʱ����Ӧ�ó���
		setVisible(true);//���ô���ɼ�
	}
	
	//ÿ�δ�������ʾ����ʱ�����Զ����ø÷���	
	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		arg0.setColor(Color.orange);
		Font font1=new Font("����", Font.ITALIC+Font.BOLD, 32);
		arg0.setFont(font1);
		arg0.drawString("��ӭ����Java���磡", 100,80);
		
		Color color2=new Color(0, 0, 128);
		arg0.setColor(color2);
		Font font2=new Font("����_GB2312", Font.PLAIN, 38);
		arg0.setFont(font2);
		arg0.drawString("��ӭ����Java���磡", 100,120);
		
		Color color3=new Color(0.25f, 0.25f, 0.0f);
		arg0.setColor(color3);
		Font font3=new Font("���Ĳ���", Font.BOLD, 50);
		arg0.setFont(font3);
		arg0.drawString("��ӭ����Java���磡", 100,170);
	}

	public static void main(String[] args) {
		PaintGraphicsJFrame frame=new PaintGraphicsJFrame();
	}
}
