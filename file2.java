import java.io.FileWriter;
import java.io.IOException;
class file2
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter f=new FileWriter("filename.txt");
			f.write("jvdkusdg");
			f.close();
			System.out.println("chgscj");
		}
		catch(IOException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
	}
}