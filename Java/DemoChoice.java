import java.applet.*;
import java.awt.*;

public  class DemoChoice extends Applet
{
	Choice ch;
	public void init()
	{
		setLayout(null);
		ch=new Choice ();
		ch.add("pune");
		ch.add("dhule");
		ch.add("mumbai");
		ch.add("nashik");
		
		add(ch);
		ch.setBounds (80,120,100,40);
	}
}
/*<applet code="DemoChoice.class" width=400 height=400></applet>*/
		