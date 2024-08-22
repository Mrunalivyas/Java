import java.applet.*;
import java.awt.*;

public class DemoChoice extends Applet
{
	Choice ch;
	public void init()
	{
		setLayout(null);
		ch=new Choice();
		ch.add("Pune");
		ch.add("Dhule");
		ch.add("Mumbai");
		ch.add("Nashik");
		add(ch);
		
		ch.setBounds(80,120,100,40);
	}
}
/*<applet code="DemoChoice.class" width=400 height=300></applet>*/
