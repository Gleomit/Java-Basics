import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class TheSmallestOfThreeNumbers 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		BigDecimal[] nums = new BigDecimal[3];
		System.out.print("a: ");
		nums[0] = scanner.nextBigDecimal();
		System.out.print("b: ");
		nums[1] = scanner.nextBigDecimal();
		System.out.print("c: ");
		nums[2] = scanner.nextBigDecimal();
		scanner.close();
		Arrays.sort(nums);
		System.out.println("smallest = " + nums[0]);
	}
}
