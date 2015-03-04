import java.util.ArrayList;
import java.util.Scanner;

public class SequenceOfEqualStrings 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		ArrayList<String> theStrings = new ArrayList<>();
		ArrayList<Integer> counts = new ArrayList<>();
	
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
		for (int i = 0; i < theStrings.size(); i++)
		{
			for (int j = 0; j < counts.get(i); j++) 
			{
				System.out.print(theStrings.get(i) + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
