import java.awt.*;

public class DemoControls extends Frame
{
	Label l1,l2;
	TextField tf;
	TextArea ta;
	Button b1;
	DemoControls()
	{
		setLayout(null);
		
		l1=new Label("Name");
		tf=new TextField();

		l2=new Label("Address");
		ta=new TextArea();

		b1=new Button("Submit");
		
		add(l1);
		add(tf);
		add(l2);
		add(ta);
		add(b1);

		l1. setBounds(50,70,100,30);
		tf. setBounds(170,70,100,30);

		l2.setBounds(50,120,100,30);
		ta.setBounds(170,120,100,30);

		b1.setBounds(100,210,100,30);
	}

	public static void main(String args[])
	{
			DemoControls d=new DemoControls();
			d.setVisible(true);
			d.setSize(400,300);
	}
		
}

