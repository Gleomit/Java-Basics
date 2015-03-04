
import java.util.Calendar;
import java.util.Scanner;



public class DaysBetweenTwoDates 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String[] dayOne = scanner.nextLine().split("-");
		String[] dayTwo = scanner.nextLine().split("-");
		scanner.close();
		long diffInMillisec=0;
        long diffInDays=0;
        Calendar firstDate = null;
        Calendar secondDate = null;
        try
        {
        	firstDate = Calendar.getInstance();
	        secondDate = Calendar.getInstance();
          
            firstDate.set(Integer.parseInt(dayOne[2]), Integer.parseInt(dayOne[1]), Integer.parseInt(dayOne[0]));       
            secondDate.set(Integer.parseInt(dayTwo[2]), Integer.parseInt(dayTwo[1]), Integer.parseInt(dayTwo[0]));
            
            diffInMillisec = secondDate.getTimeInMillis() - firstDate.getTimeInMillis();      
            diffInDays = diffInMillisec / (24 * 60 * 60 * 1000);      
            System.out.println(diffInDays);
            
        }
        catch(Exception ex)
        {
                    ex.printStackTrace();
        }             
	}

}
