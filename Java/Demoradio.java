import java.applet.*;
import java.awt.*;

public  class Demoradio extends Applet
{
	CheckboxGroup cbg;
	Checkbox ch1,ch2;

	public void init()
	{
		cbg=new CheckboxGroup();
		ch1=new Checkbox("Marathi",true,cbg);
		ch2=new Checkbox("English",false,cbg);

		add(ch1);
		add(ch2);
	}
}
/*<applet code="Demoradio.class" width=400 height=400></applet>*/
		