import java.applet.*;
import java.awt.*;

public class DemoCardLayout extends Applet
{
	Panel deck, p1,p2;
	Checkbox ch1,ch2;
	Button b1,b2;

	public void init()
	{
		deck =new Panel();
		CardLayout c= new CardLayout();	
		deck.setLayout(c);
	
		p1=new Panel();
		b1=new Button("Dhule");
		b2=new Button("Dhule");
		p1.add(b1);
		p1.add(b2);

		p2=new Panel();
		ch1=new Checkbox("red");
		ch2=new Checkbox("blue");
		p2.add(ch1);
		p2.add(ch2);

		deck.add(p1,"city");
		deck.add(p2,"color");

		add(deck);

	}

}
/*<applet code="DemoCardLayout.class" width=400 height=300></applet>*/

		