import java.util.Scanner;


public class SumTwoNumbers
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
		int a = scanner.nextInt();
		System.out.print("b: ");
		int b = scanner.nextInt();
		System.out.println("result = " + (a + b));
		scanner.close();
	}

}
