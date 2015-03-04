import java.util.Scanner;


public class FormattingNumber 
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
	
	static String getBinary(int num)
	{
		String temp = "";
		String reversedTemp = "";
		while(temp.length() < 10)
		{
			int tempInt = num % 2;
			if(tempInt == 0)
				temp += "0";
			else if(tempInt == 1)
				temp += "1";
			num /= 2;
		}
		for(int i = temp.length() - 1; i >= 0; i--)
			reversedTemp += temp.charAt(i);
		return reversedTemp;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		float b = scanner.nextFloat() , c = scanner.nextFloat();
		scanner.close();
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",getHexadecimal(a),getBinary(a),b,c);
	}

}
