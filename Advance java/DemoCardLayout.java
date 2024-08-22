import java.applet.*;
import java.awt.*;

public class DemoCardLayout extends Applet
{
	Panel deck,p1,p2;
	Button b1,b2;
	Checkbox cb1,cb2;
	public void init()
	{
		deck=new Panel();
		CardLayout c= new CardLayout ();	
		deck.setLayout(c);
		
		p1=new Panel();
		b1=new Button("Dhule");
		b2=new Button("Pune");
		p1.add(b1);
		p1.add(b2);

		p2=new Panel();
		cb1=new Checkbox("Red");
		cb2=new  Checkbox("Blue");
		p2.add(cb1);
		p2.add(cb2);

		deck.add(p1,"cities");
		deck.add(p1,"Colors");

		add(deck);
	}

}
/*<applet code="DemoCardLayout.class" width=400 height=300></applet>*/
