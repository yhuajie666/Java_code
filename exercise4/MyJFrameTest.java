package Exercise4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyJFrameTest{
	
	public void init() {
		JFrame jf=new JFrame();
		jf.setBounds(100, 100,400, 300);
		jf.setBackground(Color.BLACK);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel();
		JButton but=new JButton("dianji");
		p.add(but);
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new newJFrame();
				
			}
		});
		
		jf.setContentPane(p);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyJFrameTest().init();
	}
}

class newJFrame{
	
	public newJFrame() {
		JFrame newjf=new JFrame("新窗口");
		
		newjf.setBounds(100, 100,400, 300);
		
		JPanel panel=new JPanel();
		
		JLabel label=new JLabel("这是一个新窗口");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		
		panel.add(label);
		
		newjf.setContentPane(panel);
		newjf.setVisible(true);
	}
	
}
