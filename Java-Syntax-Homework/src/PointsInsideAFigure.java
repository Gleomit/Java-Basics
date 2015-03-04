import java.util.Scanner;


public class PointsInsideAFigure
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		float x = Float.parseFloat(scanner.next());
		float y = Float.parseFloat(scanner.next());
		scanner.close();
		if((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) ||
				(x >= 20 && x <= 22.5 && y >= 6 && y <= 13.5) ||
				(x >= 12.5 && x <= 17.5 && y >= 6 && y <= 13.5))
		{
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
