import java.util.Scanner;


public class CountAllWords 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().toLowerCase().split("[^a-z]+");
		scanner.close();
		System.out.println(line.length);
	}

}
