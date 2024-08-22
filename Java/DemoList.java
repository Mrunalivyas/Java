import java.applet.*;
import java.awt.*;

public  class DemoList extends Applet
{
	List lst;
	public void init()
	{
		
		lst=new List(2,true);
		lst.add("sakla");
		lst.add("punengri");
		lst.add("lokamt");
		lst.add("saamana");
		
		add(lst);
		
	}
}
/*<applet code="DemoList.class" width=400 height=400></applet>*/
		