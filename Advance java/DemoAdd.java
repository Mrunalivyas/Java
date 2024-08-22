import java.io.*;

class DemoAdd
{
	public static void main(String args[]) throws IOException
	{
	DataInputStream d=new DataInputStream(System.in);
	
	System.out.println("Enter value of a");
	int a=Integer.parseInt(d.readLine());
	
	System.out.println("Enter value of a");
	int b=Integer.parseInt(d.readLine());
	
	int c=a+b;
	System.out.println("sum is"+c);
	}
}	