import java.io.*;

class Divisible
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
	
		System.out.println(" Enter any number");
		int n=Integer.parseInt(d.readLine());

		if(n %5==0)
		{
	 		System.out.println("divisible by 5"+n);
		}
		else
		{
			System.out.println(" not divisible by 5"+n);
		}
	}
}		