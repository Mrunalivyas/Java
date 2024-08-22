import java.applet.*;
import java.awt.*;

public class DemoGridLayout extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		GridLayout g= new GridLayout(3,2,30,20);	
		setLayout(g);
	
		b1=new Button("frist");
		b2=new Button("second");
		b3=new Button("thrid");
		b4=new Button("fourth");
		b5=new Button("fifth");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);


	}

}
/*<applet code="DemoGridLayout.class" width=400 height=300></applet>*/

		