import java.util.Arrays;
class search2
{
	static int exp_search(int a[],int n,int x)
	{
		if(a[0]==x)
			return 0;
		int i=1;
		while(i<n && a[i]<=x)
			i=i*2;
		return Arrays.binarySearch(a,i/2,Math.min(i,n),x);
	}
}