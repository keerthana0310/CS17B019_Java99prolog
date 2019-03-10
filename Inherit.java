class Inherit 
{
	public static void main(String []args)
	 {
		 Ferrari myFer=new Ferrari(2801,"IIT");
		 Ferrari myFer2=myFer;
		 System.out.println(myFer2.regno);
		 System.out.println(myFer2.name);
		 myFer.sayFerrari();
		myFer2=myFer.newFerrari(2803,"TIRUPATI");
		System.out.println(myFer2.regno);
		 System.out.println(myFer2.getregno());
		 myFer.sayVehicle();
	 }
}
class Vehicle{
	String name;
	 int regno;
	void sayVehicle()
	{
		System.out.println("I am a Vehicle");
	}
}
class Ferrari extends Vehicle
{
	private int number;
	int getregno()
	{
		return this.number;
	}
	Ferrari (int num,String name)
	{
		
		this.number=num;
		this.name=name;
		
	}
	void sayFerrari()
	{
		System.out.println("I am a Ferrari");
	}
	Ferrari newFerrari(int number,String name)
	{
		return new Ferrari(number,name);
	}
}