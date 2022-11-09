package Exercise2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
	public static void main(String[] args) {
		
		Frame frame = new Frame();
		Panel panel = new Panel();
		
		frame.setLayout(null);
		frame.setBounds(100, 100, 400, 400);
		frame.setBackground(Color.blue);
		panel.setBounds(100, 100, 200, 200);
		panel.setBackground(Color.red);
		frame.add(panel);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		
	}
}
