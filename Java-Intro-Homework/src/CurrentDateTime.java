import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime
{
	public static void main(String args[])
	{
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a")));
	}
}
