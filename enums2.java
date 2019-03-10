enum line
{
	horizontal,vertical,diagonal
}
class enums2
{
	public static void main(String[] args)
	{
		for(line x:line.values())
		{
			System.out.println(x);
		}
	}
}