import java.awt.*;
import java.awt.event.*;

class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
		
		WindowListener sam= new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
			}
		};
	             addWindowListener(sam);
	}
}
public class FileDialogDemo
{
	public static void main(String args[])
	{
		Frame f=new SampleFrame("My Frame");
			f.setSize(300,300);
			f.setVisible(true);
		
		FileDialog FD= new FileDialog(f, "My  Frame Dialog",1);
			FD.setVisible(true);
	}
}

