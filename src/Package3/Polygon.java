package Package3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


import javax.swing.JFrame;

public class Polygon extends JFrame{

	public static void main(String[] args) {
		Polygon polygon = new Polygon();
		polygon.setTitle("Ró¿owy poligon");
		polygon.setSize(600, 600);
		polygon.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		polygon.add(new Kanwa());
		polygon.setVisible(true);
	}
}
	
	class Kanwa extends Canvas {
		public void paint(Graphics g) {
		File file = new File(("xPoints.txt"));
			
			Scanner sc = null;
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int [] xPoints = new int[20];
			int i = 0;
				while (sc.hasNextLine()) {
					xPoints[i++] = sc.nextInt();	
				}	
		
		Scanner sc2 = null;
		try {
			sc2 = new Scanner(new File("yPoints.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int [] yPoints = new int[20];
		int j = 0;
			while (sc2.hasNextLine()){
				yPoints[j++] = sc2.nextInt();
				
			}
		
	sc.close();
	sc2.close();
			
//			int xPoints[] = {5, 120, 40, 350, 75, 580, 20, 380, 50, 550, 10};
//			int yPoints[] = {40, 150, 60, 370, 80, 290, 10, 590, 60, 290, 5, 500};
			int nPoints = 19;
			g.setColor(Color.pink);
			g.drawPolygon(xPoints, yPoints, nPoints);
			
		}
	}

