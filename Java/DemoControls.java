import java.awt.*;
import java.applet.*;

public class DemoControls extends Applet
	{
		Label l1,l2;
		TextField t1;
		TextArea ta;
		Button b1;

		 public void init()
		{  
			setLayout(null);
			l1=new Label("Name:");
			t1=new TextField();					
			
			l2=new Label("Address:");	
			ta=new TextArea();

			b1=new Button("Submit");	
	
			add(l1);
			add(t1);

			add(l2);
			add(ta);

			add(b1);
			
			l1.setBounds(50,70,100,30);
			t1.setBounds(170,70,100,30);

			l2.setBounds(50,120,100,30);
			ta.setBounds(170,120,100,70);

			b1.setBounds(100,210,100,30);
		}
			
	}
/*<applet code="DemoControls.class" width=500 height=500> </applet>*/