import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ExtractAllUniqueWords 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().toLowerCase().split("[^a-z]+");
		scanner.close();
		
		ArrayList<String> words = new ArrayList<>();
		
		for (String word : line) 
		{
			if(!words.contains(word))
				words.add(word);
		}
		Collections.sort(words);
		for(String word : words)
			System.out.print(word + " ");
	}

}
