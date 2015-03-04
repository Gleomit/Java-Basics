import java.util.Scanner;

public class DecimalToHexadecimal
{
	static String getHexadecimal(int num)
	{
		String temp = "";
		String reversedTemp = "";
		while(num != 0)
		{
			int tempInt = num % 16;
			if(tempInt == 15)
				temp += "F";
			else if(tempInt == 14)
				temp += "E";
			else if(tempInt == 13)
				temp += "D";
			else if(tempInt == 12)
				temp += "C";
			else if(tempInt == 11)
				temp += "B";
			else if(tempInt == 10)
				temp += "A";
			else
				temp += tempInt;
			num /= 16;
		}
		for(int i = temp.length() - 1; i >= 0; i--)
			reversedTemp += temp.charAt(i);
		if(reversedTemp.length() >= 1)
			return reversedTemp;
		else
			return "0";
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(getHexadecimal(scanner.nextInt()));
		scanner.close();
	}

}
