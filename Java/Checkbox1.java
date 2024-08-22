import java.applet.*;
import java.awt.*;

public  class Checkbox1 extends Applet
{
	Checkbox ch1,ch2;

	public void init()
	{
		ch1=new Checkbox("Marathi");
		ch2=new Checkbox("English");

		add(ch1);
		add(ch2);
	}
}
/*<applet code="Checkbox1.class" width=400 height=400></applet>*/
		