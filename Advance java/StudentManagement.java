import java.util.Scanner;
public class StudentManagement
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int c,usr;
		store ob = new store();
	while(true)
	{
		System.out.println("\t\t:::MENU:::");
		System.out.println("1:Add   2:Searching   3.Deletion    4.Updation    5.Display     6.Exit ");
		int ch = s.nextInt();

		switch(ch)
		{
		case 1:
			System.out.println("enter the no of entries");
			usr = s.nextInt();
			ob.add(usr);
			break;
		case 2:
			ob.search();
			break;
		case 3:
			ob.delete();
			break;
		case 4:
			ob.update();
			break;

		case 5:
			ob.display();
			break;
		case 6:
			System.exit(0);
		}
		c = s.nextInt();
	}
	}
}

abstract class student 
{
	protected String name[];
	protected int rollno[];
	protected String course[];
	protected int marks[];

	abstract void display();
}
class store extends student
{

	int usr;
	
	Scanner s = new Scanner(System.in);
	int i = 0,c = 0, r = 0;

	store()
	{
		rollno = new int[10];
		name = new String[10];
		course=new String[10];
		marks=new int[10];
	}
	public void add(int usr)
	{
		this.usr = usr;
		for(i = 0;i < usr;i++)
	                  {
		System.out.println("Enter name: ");
		name[i]=s.next();
		System.out.println("Enter roll no :");
		 rollno[i]=s.nextInt();
		System.out.println("Enter course:");
		course[i]=s.next();
		System.out.println("Enter marks:");
		marks[i]=s.nextInt();
		}
		display();
	}

	public void search()
	{
		System.out.println("Enter the roll no you want to search");
		r = s.nextInt();
		for(i = 0; i<rollno.length; i++)
		{
			if (rollno[i] == r)
			{
				break;
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
		System.out.println("NAME :"  +name[i]);
		System.out.println("ROLLNO:" +rollno[i]);
		System.out.println("COURSE:"  +course[i]);
		System.out.println("MARKS:"  +marks[i]);
	}
	
	public void delete()
	{
		System.out.println("Enter the rollno to be deleted");
		r = s.nextInt();

		for(i = 0; i<rollno.length; i++)
		{
			if (rollno[i] == r)
			{
				rollno[i] = 0;
				name[i] = " ";
			}
		}
		display();
	}

	public void update()
	{
		System.out.println("Enter roll no to be updated");
		r = s.nextInt();

		for(i = 0; i<rollno.length; i++)
		{
			if(rollno[i] == r)
			{
				System.out.println("Enter the new name and roll no");
				name[i] = s.next();
				rollno[i] = s.nextInt();
				course[i]=s.next();
				marks[i]=s.nextInt();
			}
		}
		display();
	}
	void display()
	{
		System.out.println(" THE  UPDATE RECORDS OF STUDENT ARE-----");
   		System.out.println("NAME  |   ROLL NO   |  COURSE   |  MARKS|");
		for(i=0;i<rollno.length;i++)
		{
		   	 if(rollno[i]!=0)
 		   	{
				System.out.println(name[i]+      "\t"+rollno[i]+         "\t"+course[i]+       "\t"+marks[i] );
			}
		}
			System.out.print("	");
	}
} 
		         
 	
