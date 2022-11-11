package Exercise4;
//键盘监听事件
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class KeyListenerTest {
	public static void main(String[] args) {
		new MyFrame();		
	}
}
class MyFrame extends Frame{
	public MyFrame() {
		setVisible(true);
		setBackground(Color.BLUE);
		setBounds(100, 100,400,300);
		addKeyListener(new MyKeyListener());
		
	}
	
	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int key=e.getKeyCode();
			if(key==KeyEvent.VK_UP)
				System.out.println("你按de上键");
			
		}
	}
	
}