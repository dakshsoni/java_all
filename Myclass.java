import java.awt.*;
import.java.sql.*;
import java.awt.event.*;

class Myclass extends Frame implements ActionListener
{
Label l1,l2,l3;
Button b1,b2,b3,b4;
TextField t1,t2,t3;
int a,b,c;
Myclass()
{
	setVisible(true);
	setTitle("my frame");
	setSize(500,500);
	setLayout(new FlowLayout());
	
	l1=new Label("Enter your desired value1");
	l2=new Label("Enter your desired value2");
	l3=new Label("Result");
	b1=new Button("add");
	b2=new Button("sub");
	b3=new Button("multi");
	b4=new Button("divide");
	t1=new TextField(6);
	t2=new TextField(6);
	t3=new TextField(6);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b1);add(b2);add(b3);add(b4);
	addWindowListener(new Closing());
	}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a+b;
		t3.setText(c+"");
	}
	if(e.getSource()==b2)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a-b;
		t3.setText(c+"");
	}
	if(e.getSource()==b3)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a*b;
		t3.setText(c+"");
	}
	if(e.getSource()==b4)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a/b;
		t3.setText(c+"");
	}
	
}

public static void main(String s[])
{
	Myclass mc=new Myclass();
	 
}
}
class Closing extends WindowAdapter
{

	
public void windowClosing(WindowEvent e)
{
System.exit(0);	

	}	
}