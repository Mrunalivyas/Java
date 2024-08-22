import java.applet.*;
import java.awt.*;

public class DemoCheckbox extends Applet
{
	Checkbox  cb1,cb2,cb3;

	public void init()
	{
		
		cb1= new Checkbox("Marathi",true);
		cb2= new Checkbox("Hindi");
		cb3= new Checkbox("English");
		
		add(cb1);
		add(cb2);
		add(cb3);
		
	}
}
/*<applet code="DemoCheckbox.class" width=400 height=300></applet>*/
