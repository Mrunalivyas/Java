import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo extends Applet implements ActionListener
{
	TextField txtname,txtpass;
	Label lblname,lblpass;

	public void init()
	{
		lblname =new Label("Username:",Label.CENTER);
		lblpass =new Label("Password:",Label.CENTER);	

		txtname=new TextField(20);
		txtpass=new TextField(20);

		txtpass.setEchochar('*');

		add(lblname);
		add(txtname);
		add(lblpass);
		add(txtpass);

		txtname.addActionListener(this);
		txtpass.addActionListener(this);

		setBackground(color.cyan);
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("User Name:"  +  txtname.getText(),10,50);
		
		g.drawString("Select Text:"  +  txtname.getSelectText(),10,80);

		g.drawString("Password:"  +  txtpass.getText(),10,110);
	}
}
/*<applet code= TextFieldDemo width=600 height=600></applet>*/



		