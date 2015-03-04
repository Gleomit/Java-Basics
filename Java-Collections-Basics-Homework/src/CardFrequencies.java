import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CardFrequencies 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("[\\dJQKA]+");
		Matcher matcher = pattern.matcher(line);
		
		ArrayList<String> cards = new ArrayList<String>();
		ArrayList<Float> percentages = new ArrayList<Float>();

		scanner.close();
		
		int cardsCount = 0;
		
		while(matcher.find())
		{
			String temp = matcher.group();
			if(cards.contains(temp))
			{
				percentages.set(cards.indexOf(temp), percentages.get(cards.indexOf(temp)) + 1);
			}
			else 
			{
				cards.add(temp);
				percentages.add(1f);
			}
			cardsCount++;
		}
		for (String card : cards)
		{
			percentages.set(cards.indexOf(card), (percentages.get(cards.indexOf(card))/ cardsCount) * 100);
		}
		
		for (int i = 0; i < cards.size();i++) 
		{
			System.out.printf("%s - > %.2f",cards.get(i), percentages.get(i));
			System.out.print("%\n");
		}
	}

}
