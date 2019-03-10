interface vehicle
{
	public void Gear(int x);
	public void Speed(int x) ;
}
class cycle implements vehicle
{
	int gear;
	int speed;
	public void Gear(int newGear)
	{
		gear=newGear;
	}
	public void Speed(int i)
	{
		speed =speed+i;
	}
	public void print()
	{
		System.out.println("speed"+speed+"gear"+gear);
	}
	
}