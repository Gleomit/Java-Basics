import java.util.Scanner;

public class SymmetricNumbersInRange
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt() , end = scanner.nextInt();
		scanner.close();
		String tempString = "";
		boolean isSymetric = true;
		for(int i = start; i <= end; i++)
		{
			tempString = Integer.toString(i);
			int currentLength = tempString.length();
			if(currentLength <= 2)
			{
				for (int j = 0; j < tempString.length(); j++)
				{
					if(tempString.charAt(j) != tempString.charAt(0))
					{
						isSymetric = false;
					}
				}
				if(isSymetric == true)
					System.out.println(tempString);
				isSymetric = true;
			}
			else
			{
				if(tempString.charAt(0) == tempString.charAt(2))
					System.out.print(tempString + " ");
			}
		}
	}
}
