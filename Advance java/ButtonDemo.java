import java.awt.*;
import java.applet.*;

public class Lables extends Applet
{
	Label lab1,lab2,lab3;
	public void init()
	{
		lab1=new Label("LABELS",label.CENTER);
		lab2=new Label("LABELS1",label.CENTER);
		lab3=new Label("LABELS2",label.CENTER);

		add(lab1);
		add(lab2);
		add(lab3);
		setBackground(Color.cyan);
		setForeground(Color.red);

	}
}
/*<applet code="Labels.class" width=500 height=500></applet>*/
		

