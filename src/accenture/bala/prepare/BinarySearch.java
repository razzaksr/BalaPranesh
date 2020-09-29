package accenture.bala.prepare;

import java.util.Scanner;

public class BinarySearch 
{
	public void bubble(double[] accept)
	{
		for(int res=0;res<accept.length-1;res++)
		{
			for(int ref=0;ref<accept.length-res-1;ref++)
			{
				if(accept[ref]>accept[ref+1])
				{
					accept[ref]*=accept[ref+1];
					accept[ref+1]=accept[ref]/accept[ref+1];
					accept[ref]/=accept[ref+1];
				}
			}
		}
	}
	public void traverse(double[] list)
	{
		for(double tmp:list)
		{
			System.out.println(tmp);
		}
	}
	public int searchBin(double[] get,int start,int end,double desired)
	{
		int mid=(end+start)/2;
		if (get[mid]==desired)
			return mid;
		else if(get[mid]>=desired)
			return searchBin(get,0,mid,desired);
		else if(get[mid]<=desired)
			return searchBin(get,mid+1,end,desired);
		else
			return -1;
	}
	public static void main(String[] args) 
	{
		BinarySearch bin=new BinarySearch();
		double[] assets={3.4,9.1,5.6,1.2,8.9,12.5,2.3};
		bin.traverse(assets);bin.bubble(assets);
		System.out.println("After Bubble");bin.traverse(assets);
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us desired value to find its pos: ");
		int pos=bin.searchBin(assets, 0, assets.length-1, scan.nextDouble());
		if(pos==-1)
			System.out.println("Data not available");
		else
			System.out.println("Desired data @ "+pos);
	}
}
