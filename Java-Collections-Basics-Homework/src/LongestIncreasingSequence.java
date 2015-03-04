import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" "); 
		ArrayList<String> sequences = new ArrayList<>();
		scanner.close();
		int[] numbers = new int[line.length];
		for (int i = 0; i < line.length; i++)
		{
			numbers[i] = Integer.parseInt(line[i]);
		}
		
		int currentNum = numbers[0];
		String currentExpression = "" + currentNum;
		for (int i = 1; i < numbers.length; i++)
		{
			if(currentNum < numbers[i])
			{
				currentExpression += " " + numbers[i];
				currentNum = numbers[i];
			}
			else
			{
				sequences.add(currentExpression);
				currentNum = numbers[i];
				currentExpression = "" + currentNum;
			}
			if(i == numbers.length - 1)
				sequences.add(currentExpression);
		}
		int longest = sequences.get(0).split(" ").length;
		String theLongestSequence = "";
		for (String sequence : sequences)
		{
			if(sequence.split(" ").length > longest)
				longest = sequence.split(" ").length;
		}
		for (String sequence : sequences) 
		{
			if(sequence.split(" ").length == longest)
			{
				theLongestSequence = sequence;
				break;
			}
		}
		
		for (String sequence : sequences) 
		{
			System.out.println(sequence);
		}
		System.out.println("Longest: " + theLongestSequence);
	}
	
}
