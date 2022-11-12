import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class MyJFrame {
	
	public void init() {
		JFrame jf=new JFrame();
		Container container=jf.getContentPane();
		container.setBackground(Color.cyan);
		container.setLayout(new GridLayout(7,1));
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 350, 700);
		
		JPanel p1=new JPanel();
		p1.add(new JLabel("姓名"));
		p1.add(new JTextField(10));
		
		
		JPanel p2=new JPanel();
		p2.add(new JLabel("密码"));
		p2.add(new JTextField(10));
		
		JPanel p3=new JPanel();
		p3.add(new JLabel("性别"));
		JRadioButton jRadioButton1 = new JRadioButton("男");
		JRadioButton jRadioButton2 = new JRadioButton("女");
		p3.add(jRadioButton1);
		p3.add(jRadioButton2);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		JPanel p4=new JPanel();
		p4.add(new JLabel("爱好"));
		JCheckBox jCheckBox1 = new JCheckBox("篮球");
		JCheckBox jCheckBox2 = new JCheckBox("足球");
		JCheckBox jCheckBox3 = new JCheckBox("游泳");
		p4.add(jCheckBox1);
		p4.add(jCheckBox2);
		p4.add(jCheckBox3);
		
		JPanel p5=new JPanel();
		p5.add(new JLabel("籍贯"));
		JComboBox<Object> jComboBox = new JComboBox<>();
		jComboBox.addItem("广东");
		jComboBox.addItem("广西");
		p5.add(jComboBox);
		
		JPanel p6=new JPanel();
		p6.add(new JLabel("现居住地"));
		String [] location={"南宁","柳州","广州","深圳"};
		JList<Object> jList = new JList<>(location);
		p6.add(jList);
		
		JPanel p7=new JPanel();
		JButton jButton1 = new JButton("登录");
		JButton jButton2 = new JButton("重置");
		p7.add(jButton1);
		p7.add(jButton2);
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Login();
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Reset();
			}
		});
		
		
		container.add(p1);
		container.add(p2);
		container.add(p3);
		container.add(p4);
		container.add(p5);
		container.add(p6);
		container.add(p7);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyJFrame().init();
	}
}

class Login {
	
	public Login() {
		JFrame jf1 = new JFrame();
		Container contentPane = jf1.getContentPane();
		contentPane.setBackground(Color.cyan);
		jf1.setBounds(100, 100, 200, 200);
		contentPane.setLayout(new BorderLayout());
		JLabel jLabel = new JLabel("登陆成功!");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(jLabel,BorderLayout.CENTER);
		jf1.setVisible(true);
	}
}

class Reset{
	public Reset() {
		new MyJFrame().init();
	}
}
