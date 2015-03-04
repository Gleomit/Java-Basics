import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

import org.jfree.graphics2d.svg.*;

public class PaintAHouseAsSVG 
{
	static SVGGraphics2D drawHouse(SVGGraphics2D svg)
	{
		Stroke houseLines = new BasicStroke(2.5f);
		svg.setStroke(houseLines);
		svg.setColor(Color.blue);
		svg.drawLine(250, 170, 350, 70);
		
		svg.setColor(Color.blue);
		svg.drawLine(450, 170, 350, 70);
		
		svg.setColor(Color.lightGray);
		svg.fillPolygon(new int[]{250, 350, 450},new int[]{170, 70, 170},3);
		
		svg.setColor(Color.blue);
		svg.drawLine(250, 170, 450, 170);
		
		svg.setColor(Color.blue);
		svg.drawRect(400, 170, 50, 100);
		
		svg.setColor(Color.blue);
		svg.drawRect(250, 170, 100, 100);
		
		svg.setColor(Color.lightGray);
		svg.fillRect(400, 170, 50, 100);
		
		svg.setColor(Color.lightGray);
		svg.fillRect(250, 170, 100, 100);
		return svg;
	}
	
	static SVGGraphics2D drawCoordinateSystem(SVGGraphics2D svg)
	{
		Stroke coordinateStroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{2}, 0);
		Line2D line = new Line2D.Double(20, 40, 100, 40);	
		for(float i = 200;i <= 450f;i += 50f)
		{
			float temp = ((float)i / 2) / 10f;
			String tempStr = "" + new BigDecimal(temp);
			line = new Line2D.Double(i,45,i,345);
			
			svg.setStroke(coordinateStroke);
			
			svg.setColor(Color.gray);
			svg.draw(line);
			
			svg.setColor(Color.black);
			svg.drawString(tempStr,i - tempStr.length() * 3,45 - 8);
		}
		
		for(float i = 70;i <= 320f;i += 50f)
		{
			float temp = ((float)i / 2) / 10f;
			String tempStr = "" + new BigDecimal(temp);
			line = new Line2D.Double(175,i,475,i);
			
			svg.setStroke(coordinateStroke);
			
			svg.setColor(Color.gray);
			svg.draw(line);
			
			svg.setColor(Color.black);
			svg.drawString(tempStr, 175 - 25,i + tempStr.length() * 1.2f);
		}
		return svg;
	}
	public static void main(String[] args) 
	{
		SVGGraphics2D svg = new SVGGraphics2D(648, 480);
		
		svg = drawHouse(svg);
		svg = drawCoordinateSystem(svg);
		
		//Points input and drawing
		Scanner scanner = new Scanner(System.in);
		int points = scanner.nextInt();
		float x = 0;
		float y = 0;
		for (int i = 0; i < points; i++) 
		{
			x = scanner.nextFloat() * 10 * 2;
			y = scanner.nextFloat() * 10 * 2;
			if(y >= 70 && y <= 170)
			{
				float minBoundsX = 350 - (y - 70);
				float maxBoundsX = 350 + (y - 70);
				if(x >= minBoundsX && x <= maxBoundsX)
				{
					svg.setColor(Color.black);
					svg.fillOval((int)x - 4, (int)y - 4, 8, 8);
				}
				else 
				{
					svg.setColor(Color.lightGray);
					svg.fillOval((int)x - 4, (int)y - 4, 8, 8);
				}
			}
			else if(y >= 170 && y <= 270 && x >= 250 && x <= 350)
			{
				svg.setColor(Color.black);
				svg.fillOval((int)x - 4, (int)y - 4, 8, 8);
			}
			else if(y >= 170 && y <= 270 && x >= 400 && x <= 450)
			{
				svg.setColor(Color.black);
				svg.fillOval((int)x - 4, (int)y - 4, 8, 8);
			}
			else
			{
				svg.setColor(Color.lightGray);
				svg.fillOval((int)x - 4, (int)y - 4, 8, 8);
			}
		}
		scanner.close();
		//End Points inpu and drawing
		
		//File save
		try
		{
			File tempFile = new File("house.html");
			SVGUtils.writeToHTML(tempFile, "House", svg.getSVGElement());
		}
		catch(Exception ex)
		{
			
		}
		//End file save
	}
}
