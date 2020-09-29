package accenture.bala.prepare;

public class Candidate 
{
	float[] drive={429.8F,600.8F,780.5F,1200.5F,870.1F};
	// mod returntype method_name(parameters)
	public void copy()
	{
		float[] temp=new float[drive.length];
		for(int index=0;index<temp.length;index++)
		{
			temp[index]=drive[index];
			System.out.println(temp[index]);
		}
	}
	public void findMatch(int budget)
	{
		System.out.println(budget+" matched drive prices are: ");
		for(int pos=0;pos<drive.length;pos++)
		{
			if(drive[pos]<=budget)
			{
				System.out.println(drive[pos]);
			}
		}
	}
	public void bigDay(float percent)
	{
		System.out.println(percent+" Discount going to happen");
		for(int each=0;each<drive.length;each++)
		{
			//drive[each]=drive[each]-(drive[each]*percent)/100;
			drive[each]-=(drive[each]*percent)/100;
			System.out.println("Updated is: "+drive[each]);
		}
	}
	public static void main(String[] args) 
	{
		Candidate can=new Candidate();
		System.out.println(can.drive.length);
		can.copy();can.findMatch(700);
		can.bigDay(50);
	}
}
