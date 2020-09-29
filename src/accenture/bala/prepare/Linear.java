package accenture.bala.prepare;

import java.util.Arrays;
import java.util.Scanner;

public class Linear 
{
	/*public static void react(long term)
	{
		System.out.println("React received: "+term);
		term=98765456785L;
		System.out.println("React updated the term: "+term);
	}
	public static void hai(long[] tick)
	{
		System.out.println("Listing in hai:\n"+
	Arrays.toString(tick));
		tick[1]=3456787654L;
		System.out.println("Listing after changes in hai:\n"+
		Arrays.toString(tick));
	}*/
	public static void main(String[] args) 
	{
		/*long[] contact={987654567L,8765436L,3234567L,345678L,45678L};
		Linear.react(contact[2]);
		System.out.println("In main 2 index is: "+contact[2]);
		Linear.hai(contact);
		System.out.println("Listing in main after calling hai:\n"+
		Arrays.toString(contact));*/
		int[] cc={120,200,125,160,220,100,50,500,150,110};
		Scanner scan=new Scanner(System.in);
		// nextInt, nextFloat, nextDouble, nextLong,next, nextLine
		System.out.println("Please tell us desired CC: ");
		int users=scan.nextInt();
		int pos=Linear.binSearch(cc, users);// loop
		//int pos=Linear.search(cc,0,cc.length-1,users);// recursion
		if(pos!=-1)
		{System.out.println(users+" found @ "+pos);}
		else{System.out.println(users+" not found");}
	}
	public static int binSearch(int[] who,int desired)
	{
		int index;
		for(index=0;index<who.length;index++)
		{
			if(who[index]==desired)
			{return index;}
		}
		return -1;
	}
	public static int search(int[] who,int start,int end,int desired)
	{
		if(start>end){return -1;}
		else
		{
			if(who[start]==desired)
			{return start;}
			else{start++;return search(who,start,end,desired);}
		}
	}
}