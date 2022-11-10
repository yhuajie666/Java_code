package Exercise3;

import java.awt.*;

public class TestPanel {
	public static void main(String[] args) {
		
		Frame frame=new Frame("anniu");
		frame.setVisible(true);
		frame.setBounds(100, 100, 400, 300);
		frame.setLayout(new GridLayout(2,1));
		frame.setBackground(Color.BLACK);
		
		Panel p1=new Panel(new BorderLayout());
		Panel p2=new Panel(new GridLayout(2,1));
		
		p1.add(new Button("but1"),BorderLayout.WEST);
		p1.add(new Button("but2"),BorderLayout.EAST);
		
		p2.add(new Button("but3"));
		p2.add(new Button("but4"));
		
		p1.add(p2,BorderLayout.CENTER);
		frame.add(p1);
		
	}
}
