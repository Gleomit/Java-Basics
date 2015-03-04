import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RandomHandsOf5Cards
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
		Random randomGenerator = new Random();
		ArrayList<String> theCards = new ArrayList<>();
		for(String face : faces)
		{
			for(char suit : suits)
			{
				theCards.add(face + suit);
			}
		}
	
		for(int i = 0; i < n;i++)
		{
			String hand = "";
			while(hand.split(" ").length < 5)
			{
				String tempCard = theCards.get(randomGenerator.nextInt(52));
				if(!hand.contains(tempCard))
					hand += tempCard + " ";
			}
			System.out.println(hand);
		}
	}

}
