package Exercise2;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("我的第一个GUI界面");
		
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setBackground(Color.blue);
		frame.setLocation(100, 100);
		
		
		
		
	}
}
