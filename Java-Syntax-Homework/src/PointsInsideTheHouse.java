import java.util.Scanner;


public class PointsInsideTheHouse
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		float x = Float.parseFloat(scanner.next());
		float y = Float.parseFloat(scanner.next());
		if(y >= 3.5 && y <= 8.5)
		{
			float minBoundsX = 17.5f - (y - 3.5f);
			float maxBoundsX = 17.5f + (y - 3.5f);
			if(x >= minBoundsX && x <= maxBoundsX)
				System.out.println("Inside");
			else 
			{
				System.out.println("Outside");
			}
		}
		else if(y >= 8.5 && y <= 13.5 && x >= 12.5 && x <= 17.5)
			System.out.println("Inside");
		else if(y >= 8.5 && y <= 13.5 && x >= 20 && x <= 22.5)
			System.out.println("Inside");
		else
		{
			System.out.println("Outside");
		}
		scanner.close();
	}

}
