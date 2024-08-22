import java.awt.*;
import java.awt.event.*;

class DialogBoxDemo extends Dialog implements  ActionListener
{
	DialogBoxDemo(Frame parent,String title,boolean mode)
	{
		super(parent,title,mode );

		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);

		Label lbl =new Label("Dialogbox Demo");
			add(lbl);
		Button b=new Button("click here");
			add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.print("\n Dialog Button is clicked");
	}
}

class DialogDemo extends Frame implements ActionListener
{
	String str=" ";		
	
	DialogDemo(String title)
	{
		super(title);
		setSize(600,600);
		setVisible(true);

		Button b= new Button("click here");
			add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.print("\n Frame Button is clicked");
	}
	
	public static void main(String args[])
	{
		DialogDemo d=new DialogDemo("My Frame");
		
		DialogBoxDemo box=new DialogBoxDemo(d,"My DialogBox", false);
	}
}