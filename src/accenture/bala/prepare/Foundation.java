package accenture.bala.prepare;

// int(4),short(2),long(8)>> whole
// Integer, Short, Long
// float(4),double(8)>> decimal point
// Float, Double
// byte(1)>> 
// Byte
// char(2)>> '@' '2' 'Y'
// Character
// boolean>> true/false
// Boolean

public class Foundation
{
	public static void main(String[] hai) 
	{
		int lapPrice=33250;long sNo=87655676545L;
		String brand="Toshiba";float disSize=15.6F;
		System.out.print("Are you desire to learn java ");
		String mobBrand="Redmi";Short ramSize=4; Double price=15600.4;
		System.out.println("Welcome to Zealous");
		System.out.println("Laptop details: ");
		System.out.println(brand+"\t"+disSize+"\t"+sNo+"\t"+lapPrice);
		System.out.println("Mobile details: ");
		System.out.printf("%s\t%d\t%f",mobBrand,ramSize,price);
	}
}
