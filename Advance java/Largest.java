import java.io.*;

class Largest
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
	
		System.out.println("Enter the first number:");
		int a=Integer.parseInt(d.readLine());

		System.out.println("Enter the second number:");
		int b=Integer.parseInt(d.readLine());
	
		System.out.println("Enter the three number:");
		int c=Integer.parseInt(d.readLine());
	
		if(a>b && a>c)
		{
			System.out.println("Largest number is:"+a);
		}
		else if(b>c)
		{
			System.out.println("Largest number is:"+b);
		}
		else
		{
			System.out.println("Largest number is:"+c);
		}
	}
}
