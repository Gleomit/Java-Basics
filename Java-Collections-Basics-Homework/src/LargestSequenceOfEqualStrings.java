import java.util.ArrayList;
import java.util.Scanner;


public class LargestSequenceOfEqualStrings 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		ArrayList<String> theStrings = new ArrayList<>();
		ArrayList<Integer> counts = new ArrayList<>();
		int maxCount = 0;
		int indexOfTheString = 0;
		for(String string : line)
		{
			if(theStrings.contains(string))
			{
				counts.set(theStrings.indexOf(string), counts.get(theStrings.indexOf(string)) + 1);
			}
			else
			{
				theStrings.add(string);
				counts.add(1);
			}
		}
		for(int i = 0; i < counts.size();i++)
		{
			if(counts.get(i) > maxCount)
			{
				maxCount = counts.get(i);
				indexOfTheString = i;
			}
		}
		
		for (int i = 0; i < maxCount; i++)
		{
			System.out.print(theStrings.get(indexOfTheString) + " ");
		}
		scanner.close();
	}
}
