package accenture.bala.prepare;

public class Root 
{
	String hai;
	static
	{
		System.out.println("Execution came inside static");
		Root root=new Root();
		root.hai="InfoView";
		System.out.println("Inside static: "+root.hai);
	}
	public Root()
	{
		hai="Infosys";System.out.println("Inside constructor: "+hai);
	}
	public static void main(String[] args) 
	{
		System.out.println("Execution came inside main");
		// ClassName object=new ClassName();
		Root root=new Root();
		root.hai="Cognizant";
		System.out.println("Inside main: "+root.hai);
	}
}
