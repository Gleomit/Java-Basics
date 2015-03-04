import java.util.Scanner;


public class Generate3LetterWords
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < line.length(); i++) 
		{
			for (int j = 0; j < line.length(); j++) 
			{
				for (int k = 0; k < line.length(); k++) 
				{
					System.out.print(line.charAt(i) + "" + line.charAt(j) + "" + line.charAt(k) + " ");
				}
			}
		}
	}

}
