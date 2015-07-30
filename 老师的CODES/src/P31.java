import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class P31 extends JFrame {
	private JComboBox depJComboBox,speJComboBox;
	private String depName[]={"软件学院","外语学院","管理学院"};
	private String speName[][]=
			{{"软件开发","软件测试","网络工程"},
			{"英语","日语","法语"},
			{"工商管理","会计","市场营销"},
			};
	
	
	public P31(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		setSize(dimension.width / 4, dimension.height / 4);
		setLocation(3*dimension.width / 8, 3*dimension.height / 8);
		setTitle("下拉列表的使用");
		
		depJComboBox=new JComboBox(depName);
		
		speJComboBox=new JComboBox(speName[0]);
		
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
			
		depJComboBox.addItemListener(
				new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						speJComboBox.removeAllItems();
						int index=depJComboBox.getSelectedIndex();
						//cityJComboBox=new JComboBox(cityName[index]);//错误	，等于重新创建了一个下拉列表					
						for (int i = 0; i < speName[index].length; i++) {
							speJComboBox.addItem(speName[index][i]);
						}
					}
				}
				);
		
		container.add(depJComboBox);
		container.add(speJComboBox);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		P31 demo=new P31();
	}

}
