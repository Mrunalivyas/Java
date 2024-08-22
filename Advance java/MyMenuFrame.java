import java.awt.*;
import java.awt.event.*;

class MyMenuFrame extends Frame
{
   	String msg=null;      
	MenuBar mbar;                                                                     

	MyMenuFrame(String title)
	{
		super(title);
		mbar = new MenuBar();
		setMenuBar(mbar);
		Menu  file =new Menu("file");

		MenuItem item1 ,  item2 ,  item3 ,  item4 ,  item5;

		file. add(item1=new MenuItem("New"));
		file. add(item2=new MenuItem("Open"));
		file. add(item3=new MenuItem("Save"));
		file. add(item4=new MenuItem("-"));
		file. add(item5=new MenuItem("Exit"));

		mbar.add(file);
		//2

		Menu edit =new Menu("Edit");
		MenuItem item6,item7,item8,item9;

		//MenuShortcut srct=new MenuShortcut(MenuShortcut.CTRL);

		edit.add(item6=new MenuItem("Find"));
		edit.add(item7=new MenuItem("Replace"));
		edit.add(item8=new MenuItem("zoom-in"));
		edit.add(item9=new MenuItem("-"));

		Menu zoom=new Menu("zoom");
		
		MenuItem item10,item11,item12;

		zoom.add(item10=new MenuItem("50%"));
		zoom.add(item11=new MenuItem("100%"));
		zoom.add(item12=new MenuItem("200%"));

		edit.add(zoom);
		mbar.add(edit);

		//3

		Menu debugging =new Menu("debugging");
		
		CheckboxMenuItem debug=new CheckboxMenuItem("Debug",true);

		MenuItem test=new MenuItem("Undo");
			debugging.add(debug);
			debugging.add(test);

			mbar.add(debugging);
		}
		public static void main(String args[])
		{
			MyMenuFrame my=new MyMenuFrame("Hello");
			my.setVisible(true);
			my.setSize(500,500);
		}
}