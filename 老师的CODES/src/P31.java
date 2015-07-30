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
	private String depName[]={"���ѧԺ","����ѧԺ","����ѧԺ"};
	private String speName[][]=
			{{"�������","�������","���繤��"},
			{"Ӣ��","����","����"},
			{"���̹���","���","�г�Ӫ��"},
			};
	
	
	public P31(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		setSize(dimension.width / 4, dimension.height / 4);
		setLocation(3*dimension.width / 8, 3*dimension.height / 8);
		setTitle("�����б��ʹ��");
		
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
						//cityJComboBox=new JComboBox(cityName[index]);//����	���������´�����һ�������б�					
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
