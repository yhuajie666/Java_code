package Exercise2;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame{
	static int id=0;
	
	public MyFrame(int x,int y,int w ,int h) {
		id++;
		setBackground(Color.green);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
	}
}
