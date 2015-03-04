import java.util.Scanner;


public class CountSpecifiedWord
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().toLowerCase().split("[^a-z]+");
		String wordToSearch = scanner.nextLine();
		scanner.close();
		int result = 0;
		for(String word : line)
		{
			if(word.equals(wordToSearch))
				result++;
		}
		System.out.println(result);
	}

}
