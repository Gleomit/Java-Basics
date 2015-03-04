import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountSubstringOccurrences 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine().toLowerCase();
		String wordToSearch = scanner.nextLine();
		scanner.close();
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(line);
		ArrayList<String> allWords = new ArrayList<>();
		while(matcher.find())
		{
			allWords.add(matcher.group());
		}
		
		int result = 0;
		for (String word : allWords)
		{
			if(word.equals(wordToSearch))
				result++;
			else if(word.length() > wordToSearch.length())
			{
				for (int i = 0; i <= word.length() - wordToSearch.length(); i++) 
				{
					if(word.substring(i,i + wordToSearch.length()).equals(wordToSearch))
						result++;
				}
			}
		}
		System.out.println(result);
	}

}
