import java.applet.*;
import java.awt.*;

public class DemoFlowLayout extends Applet
{
	Button b1,b2,b3;
	public void init()
	{
		FlowLayout f= new FlowLayout (FlowLayout.RIGHT,30,20);	
		setLayout(f);
	
		b1=new Button("OK");
		b2=new Button("RESET");
		b3=new Button("CANCEL");

		add(b1);
		add(b2);
		add(b3);
	}

}
/*<applet code="DemoFlowLayout.class" width=400 height=300></applet>*/
