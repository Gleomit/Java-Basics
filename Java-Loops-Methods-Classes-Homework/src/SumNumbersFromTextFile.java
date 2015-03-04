import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SumNumbersFromTextFile 
{

	public static void main(String[] args) 
	{
		File file = new File("Input.txt");
		if(file.exists())
		{
			int sum = 0;
			try 
			{
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextInt())
				{
					sum += scanner.nextInt();
				}
				scanner.close();
				System.out.println(sum);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
		else
			System.out.println("Error");
	}

}
