import java.applet.*;
import java.awt.*;

public class DemoList extends Applet
{
	List lst;
	public void init()
	{
		lst=new List(3,true);
		lst.add("Lokama");
		lst.add("Sakal");
		lst.add("Samena");
		lst.add("Deshdut");

		add(lst);
		
		
	}
}
/*<applet code="DemoList.class" width=400 height=300></applet>*/
