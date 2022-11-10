package Exercise3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionListemerTest {
	public static void main(String[] args) {
		
		new MyFrame();
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		//1.三个文本框
		TextField num1=new TextField(10);
		TextField num2=new TextField(10);
		TextField num3=new TextField(20);
		//2.一个标签
		Label l1=new Label("+");
		//3.一个按钮
		Button but=new Button("=");
		but.addActionListener(new count(num1,num2,num3));
		
		setLayout(new FlowLayout());
		setVisible(true);
		add(num1);
		add(l1);
		add(num2);
		add(but);
		add(num3);
		pack();
		
	}
}

class count implements ActionListener{
	private TextField num1,num2,num3;

	public count(TextField num1,TextField num2,TextField num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(num1.getText());
		int n2=Integer.parseInt(num2.getText());
		
		num3.setText(""+(n1+n2));
		
		num1.setText("");
		num2.setText("");
		
		
	}
}
 

