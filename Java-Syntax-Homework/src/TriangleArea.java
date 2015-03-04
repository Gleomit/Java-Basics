import java.awt.Point;
import java.util.Scanner;


public class TriangleArea 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		java.awt.Point pointOne = new Point(scanner.nextInt(),scanner.nextInt());
		java.awt.Point pointTwo = new Point(scanner.nextInt(),scanner.nextInt());
		java.awt.Point pointThree = new Point(scanner.nextInt(),scanner.nextInt());
		double a = pointTwo.distance(pointThree);
		double b = pointOne.distance(pointThree);
		double c = pointOne.distance(pointTwo);
		scanner.close();
		if(b + c > a && a + c > b && a + b > c)
		{
			double halfPerimeter = (a + b + c) / 2;
			double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
			System.out.println(Math.round(area));
		}
		else
		{
			System.out.println(0);
		}
	}
}
