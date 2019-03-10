class search1
{
	public static int search(int a[],int x)
	{
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		if(a[i]==x)
			return i;
	}
	return -1;
}
	//main program
}