import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class file3
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("filename.txt");
			Scanner reader=new Scanner(f);
			while(reader.hasNextLine())
			{
				String str=reader.nextLine();
				System.out.println(str);
			}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
	}
}