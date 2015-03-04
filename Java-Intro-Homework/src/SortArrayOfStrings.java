import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] theStrings = new String[n];
		for (int i = 0; i < n; i++) 
		{
			theStrings[i] = scanner.nextLine();
		}
		scanner.close();
		Arrays.sort(theStrings);
		for(String str : theStrings)
			System.out.println(str);
	}

}
