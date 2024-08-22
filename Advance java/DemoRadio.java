import java.applet.*;
import java.awt.*;

public class DemoRadio extends Applet
{
	CheckboxGroup cbg;
	Checkbox cb1;
	Checkbox cb2;

	public void init()
	{
		cbg=new CheckboxGroup();
		cb1= new Checkbox("Male",true,cbg);
		cb2= new Checkbox("Female",false,cbg);
		
		add(cb1);
		add(cb2);
		
	}
}
/*<applet code="DemoRadio.class" width=400 height=300></applet>*/
