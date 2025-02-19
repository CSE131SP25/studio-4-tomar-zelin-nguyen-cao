package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		boolean filled = in.nextBoolean();
		double parameter1 = in.nextDouble();
		double parameter2 = in.nextDouble();
		double parameter3 = in.nextDouble();
		double parameter4 = in.nextDouble();
		double parameter5 = in.nextDouble();
		double parameter6 = in.nextDouble();
		Color rainbow = new Color(color1, color2, color3);
		StdDraw.setPenColor(rainbow);
		
		if (shape.equals("rectangle")) {
			if(filled == true) {
				StdDraw.filledRectangle(parameter1, parameter2, parameter3, parameter4);
			}
			else {
				StdDraw.rectangle(parameter1, parameter2, parameter3, parameter4);
			}
		}
		if(shape.equals("ellipse")) {
			if(filled == true) {
				StdDraw.filledEllipse(parameter1, parameter2, parameter3, parameter4);
			}else {
				StdDraw.ellipse(parameter1, parameter2, parameter3, parameter4);
			}
		}
		if(shape.equals("triangle")) {
			double[] xcoord = new double[3];
			xcoord[0] = parameter1;
			xcoord[1] = parameter3;
			xcoord[2] = parameter5;
			double[] ycoord = new double[3];
			ycoord[0] = parameter2;
			ycoord[1] = parameter4;
			ycoord[2] = parameter6;
			if(filled == true) {
				StdDraw.filledPolygon(xcoord, ycoord);
			}else {
				StdDraw.polygon(xcoord, ycoord);
			}
			
		}
	}
}
