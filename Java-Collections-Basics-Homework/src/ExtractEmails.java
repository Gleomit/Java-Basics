import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		Pattern pattern = Pattern.compile("[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}");
		Matcher matcher = pattern.matcher(line);
		ArrayList<String> emails = new ArrayList<>();
		while(matcher.find())
		{
			emails.add(matcher.group());
		}
		
		for (String email : emails)
		{
			System.out.println(email);
		}
		scanner.close();
	}

}
