import java.util.Locale;
import java.util.Scanner;


public class AngleUnitConverter
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String[] lines = new String[n];
		double[] angles = new double[n];
		String tempString = "";
		for (int i = 0; i < n; i++)
		{
			double angle = scanner.nextDouble();
			String measure = scanner.next();
			
			if(measure.equals("deg"))
			{
				angle = angle * (Math.PI / 180);
				tempString = "rad";
			}
			else if(measure.equals("rad"))
			{
				angle = angle * (180 / Math.PI);
				tempString = "deg";
			}
			lines[i] = tempString;
			angles[i] = angle;
		}
		scanner.close();
		for(int i = 0; i < angles.length;i++)
			System.out.printf("%.6f %s\n", angles[i],lines[i]);
	}

}
