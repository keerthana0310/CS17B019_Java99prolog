class inheritance
{
	protected String company ="ferrari";
	public void horn ()
	{
		System.out.println("tuut,tuut!");
	}
}
class car extends inheritance
{
	private String name="Fiorano";
	public static void main (String[] args)
	{
		car c=new car();
		c.horn(); 
		System.out.println(c.company+""+c.name);
		
	}
}