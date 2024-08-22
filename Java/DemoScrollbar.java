import java.awt.*;
import java.applet.*;

public class DemoScrollbar extends Applet
{
	Scrollbar sb1, sb2, sb3;
	public void init()
	{
		setLayout(null);

		sb1=new Scrollbar(Scrollbar.VERTICAL,50,30,0,255);
		sb2=new Scrollbar(Scrollbar.VERTICAL,30,30,0,255);
		sb3=new Scrollbar(Scrollbar.VERTICAL,70,30,0,255);
	
		add(sb1);
		add(sb2);
		add(sb3);


		sb1.setBounds(50,70,30,250);
		sb2.setBounds(100,70,30,250);
		sb3.setBounds(150,70,30,250);

	}

}
/*<applet code="DemoScrollbar.class" width=500 height=500></applet>*/