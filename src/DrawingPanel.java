import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	
	
	public DrawingPanel() {
		//Canvas background color
		//setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		//Setting color of String
		//g.setColor(Color.RED);
		//Writing Sentence: g.drawString("This is a string", x, y);
		//g.drawString("This is a string", 10, 20);
		//x1 and y1 are the starting point of the line. x2 and y2 is the ending point of the line.
		
		/*Smiley face
		g.drawLine(100, 100, 100, 150);
		g.drawLine(150, 100, 150, 150);
		//Polygon: check u4l01
		//Arc circles:
		g.fillArc(100,  200, 50, 50, 180,180);
		*/
		
		//code for kite
		int x [] = {200, 200, 330, 200, 200, 70};
		int y [] = {4, 240, 240, 484, 240, 240};
		int x2 [] = {200, 200, 325, 200, 200, 75};
		int y2 [] = {9, 240, 240, 479, 240, 240};
		int x3 [] = {200, 330, 200, 200, 70, 200};
		int y3 [] = {4, 240, 240, 484, 240, 240};
		int x4 [] = {200, 325, 200, 200, 75, 200};
		int y4 [] = {9, 240, 240, 479, 240, 240};
		g.setColor(Color.RED);
		g.fillPolygon(x, y, 6);
		g.setColor(Color.BLUE);
		g.fillPolygon(x2, y2, 6);
		g.setColor(Color.GRAY);
		g.fillPolygon(x3, y3, 6);
		g.setColor(Color.WHITE);
		g.fillPolygon(x4, y4, 6);
	}
	
	public Dimension getPreferredSize() {
		//Canvas size
		return new Dimension(500, 500);
	}
}
