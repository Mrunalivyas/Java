import java.awt.*;
import java.applet.*;

public class Labels extends Applet
{
	Label lab1,lab2,lab3;
	public void init()
	{
		lab1=new Label("LABELS",Label.CENTER);
		lab2=new Label("LABELS1",Label.CENTER);
		lab3=new Label("LABELS2",Label.CENTER);

		add(lab1);
		add(lab2);
		add(lab3);
		setBackground(Color.cyan);
		setForeground(Color.red);

	}
}
/*<applet code="Labels.class" width=500 height=500></applet>*/
		

