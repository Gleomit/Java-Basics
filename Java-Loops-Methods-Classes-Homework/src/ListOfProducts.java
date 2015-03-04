import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


class Product
{
	public String name;
	public String price; //to store the original value: 1.20 = 1.20 with float 1.20 - 1.2
	public Product() 
	{
		name = "";
		price = "";
	}
	public Product(String name, String price) 
	{
		this.name = name;
		this.price = price;
	}
}

public class ListOfProducts
{
	public static void main(String[] args) 
	{
		File file = new File("Input.txt");
		if(file.exists())
		{
			ArrayList<Product> products = new ArrayList<>();
			try
			{
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextLine())
				{
					String[] temp = scanner.nextLine().split(" ");
					products.add(new Product(temp[0], temp[1]));
				}
				scanner.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			//sorting
			for (int i = 0; i < products.size(); i++) 
			{
				for (int j = 0; j < products.size(); j++) 
				{
					if(Double.parseDouble(products.get(i).price) < Double.parseDouble(products.get(j).price))
					{
						Product tempProduct = products.get(i);
						products.set(i, products.get(j));
						products.set(j, tempProduct);
					}
				}
			}
			
			try 
			{
				PrintWriter writer = new PrintWriter("Output.txt");
				for (Product product : products)
				{
					writer.println(product.price + " " + product.name);
				}
				writer.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The file does not exist.");
		}
	}

}
