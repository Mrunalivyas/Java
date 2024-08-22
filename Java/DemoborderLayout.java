import java.applet.*;
import java.awt.*;

public class DemoBorderLayout extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		BorderLayout b= new BorderLayout();	
		setLayout(b);
	
		b1=new Button("top");
		b2=new Button("right");
		b3=new Button("bottom");
		b4=new Button("left");
		b5=new Button("center");

		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);

	}

}
/*<applet code="DemoBorderLayout.class" width=400 height=300></applet>*/

		