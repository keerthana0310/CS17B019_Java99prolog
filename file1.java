import java.io.File;
import java.io.IOException;
class file1
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("filename.txt");
			if(f.createNewFile())
			{
				System.out.println("file:"+f.getName());
			}
			else
			{
				System.out.println("exits");
			}
		}
		catch(IOException e)
		{
			System.out.println("error");
			e.printStackTrace();		
			}
	}
}