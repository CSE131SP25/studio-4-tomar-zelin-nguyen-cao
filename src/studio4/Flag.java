package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.ellipse(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(Color.GREEN);
		double[] ycoord = new double[3];
		ycoord[0] = 0.2;
		ycoord[1] = 0.6;
		ycoord[2] = 0.2;
		double[] xcoord = new double[3];
		xcoord[0] = 0.2;
		xcoord[1] = 0.5;
		xcoord[2] = 0.8;
		StdDraw.filledPolygon(xcoord, ycoord);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5, 0.7, 0.3, 0.1);
	}
}