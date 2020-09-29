package accenture.bala.prepare;

import java.util.Scanner;

public class TestScan 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us details: ");
		String statement=scan.nextLine();
		System.out.println("Received data statement:"+statement);
		int hai=scan.nextInt();
		System.out.println("Int got: "+hai);
		String data=scan.nextLine();
		System.out.println("data:"+data);
		System.out.println("Operation done");
	}
}
