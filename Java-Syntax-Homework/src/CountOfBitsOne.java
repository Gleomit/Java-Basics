import java.util.Scanner;


public class CountOfBitsOne 
{
	static String getBinary(int num)
	{
		String temp = "";
		while(num != 0)
		{
			int tempInt = num % 2;
			if(tempInt == 0)
				temp += "0";
			else if(tempInt == 1)
				temp += "1";
			num /= 2;
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String temp = getBinary(Integer.parseInt(scanner.next()));
		int counter = 0;
		for (int i = 0; i < temp.length(); i++)
		{
			if(temp.charAt(i) == '1')
				counter++;
		}
		System.out.println(counter);
		scanner.close();
	}

}
