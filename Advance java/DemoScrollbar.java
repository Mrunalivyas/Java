import java.awt.*;

public class DemoScrollbar extends Frame
{
	Scrollbar sb1,sb2,sb3;
	DemoScrollbar()
	{
		setLayout(null);
		
		sb1=new Scrollbar(SCROLLBAR.VERTICAL,50,30,0,255);
		sb2=new Scrollbar(SCROLLBAR.VERTICAL,30,30,0,255);
		sb3=new Scrollbar(SCROLLBAR.VERTICAL,70,30,0,255);
		
		
		add(sb1);
		add(sb2);
		add(sb3);
		

		sb1. setBounds(70,70,30,200);
		sb2. setBounds(120,70,30,200);
		sb3.setBounds(170,70,30,200);
		
	}

	public static void main(String args[])
	{
			DemoScrollbar d=new DemoScrollbar();
			d.setVisible(true);
			d.setSize(400,300);
	}
		
}

