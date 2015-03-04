import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWord 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().toLowerCase().split("[^a-z]+");
		scanner.close();
		
		int frequency = 0;
		
		ArrayList<String> mostFrequentWords = new ArrayList<>();
		HashMap<String, Integer> wordsHashMap = new HashMap<>();
		
		for (int i = 0; i < line.length; i++) 
		{
			if(wordsHashMap.containsKey(line[i]))
			{
				wordsHashMap.replace(line[i], wordsHashMap.get(line[i]) + 1);
			}
			else
			{
				wordsHashMap.put(line[i], 1);
			}
		}
		
		for (Integer num : wordsHashMap.values()) 
		{
			if(num > frequency)
				frequency = num;
		}
		
		for (String key : wordsHashMap.keySet()) 
		{
			if(wordsHashMap.get(key) == frequency)
				mostFrequentWords.add(key);
		}
		Collections.sort(mostFrequentWords);
		for(String word : mostFrequentWords)
		{
			System.out.println(word + " -> " + frequency + " times");
		}
	}

}
