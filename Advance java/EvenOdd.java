import java.io.*;

class EvenOdd
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
	
		System.out.println(" Enter any number");
		int n=Integer.parseInt(d.readLine());

		if(n %2==0)
		{
	 		System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}		