
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CombineListOfLetters 
{

	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		ArrayList<Character> lineOne = new ArrayList<>();
		ArrayList<Character> lineTwo = new ArrayList<>();
		ArrayList<Character> list = new ArrayList<>();
		int line = 0;
		
		while(line < 2)
		{
			try 
			{
				char temp = (char) reader.read();
				if(temp >= 'a' && temp <= 'z')
				{
					if(line == 0)
					{
							lineOne.add(temp);
					}
					else
					{
						lineTwo.add(temp);
					}
				}
				if(temp == '\n')
					line++;
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		try 
		{
			reader.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		for (Character character : lineOne)
		{
			list.add(character);
		}
		
		for (Character character : lineTwo)
		{
			if(!lineOne.contains(character))
				list.add(character);
		}
		
		for (Character character : list) 
		{
			System.out.print(character + " ");
		}
	}

}
