package Application;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * 
 * @author Jaemarie Solyst
 * This small application can draw a line and a point when the user drags (for a line)
 * and clicks (for a point).
 *
 */
public class DrawLineAndPoint extends Canvas implements MouseListener, MouseMotionListener {
	/* ints to keep track of X and Y values of where the user has pressed and
	released clicks */
	private int pressX;
	private int pressY;
	private int releaseX;
	private int releaseY;

	// boolean to keep track of if the user has already clicked
	private boolean released = false;
	private boolean drag = false;

	//ADDED BY IOANNA DENI
	private DB database;
	private int counter;

	/**
	 * Constructor adds the mouseListner so that the mouseEvents 
	 * will go through.
	 */
	public DrawLineAndPoint(DB database) {
		
		this.database = database;
		
		//Adds MouseListener and MouseMotionListener to the canvas
		addMouseListener(this);
		//ADDED BY SNEHA KANAUJIA
		addMouseMotionListener(this);
		
		//Sets the canvas color to white
		this.setBackground(Color.WHITE);
	}

	/**
	 * The paint method draws a line from where the user pressed to where
	 * they released. Draws a 
	 * @param g takes in graphics
	 */
	public void paint(Graphics g) {
		//ADDED BY IOANNA DENI - original by LOUIS CONOVOR
		super.paint(g);
		
		//ADDED BY SNEHA KANAUJIA
		//Checks if drag boolean is true and then draws the line from start point to current mouse location point saved in release x and y variables
		if(drag==true)
		{
			g.drawLine(pressX, pressY, releaseX, releaseY);
		}

		//Checks if released boolean is true
		if (released==true) {
			System.out.println("in paint");
			
			//Cycles through database
			for (int i=0; i<database.Size(); i=i+2){
				//Will later implement if-else statements to check if object in database is line/polygon/other geometry object etc
				
				//Draws ovals at the start and end points of the line as well as line in between the two points (data on these points is pulled from database list)
				Point p1 = database.Get(i);
				g.fillOval(p1.x - 2, p1.y - 2, 5, 5);
				Point p2 = database.Get(i+1);
				g.fillOval(p2.x - 2, p2.y - 2, 5, 5);
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
		}
	}

	/** saves X and Y values where the mouse is initially pressed
	 * @param e mouse event passed in to record location of press
	 */
	public void mousePressed(MouseEvent e) {
		// save press X and Y values
		System.out.println("in press");
		pressX = e.getX();
		pressY = e.getY();


		//ADDED BY IOANNA DENI
		Point newPoint = new Point(pressX,pressY);
		database.Add(newPoint);
		counter=counter+1;
	}

	/** saves X and Y values where the mouse is released
	 * @param e mouse event passed in to record location of release
	 */
	public void mouseReleased(MouseEvent e) {
		// save release X and Y values
		System.out.println("in release");
		releaseX = e.getX();
		releaseY = e.getY();

		//ADDED BY IOANNA DENI
		database.Add(new Point(releaseX,releaseY));
		counter =counter+1;

		// set boolean to true so that it may draw a line (and not draw anything prior to this)
		released = true;
		repaint();
		
		//ADDED BY SNEHA KANAUJIA
		//Sets drag boolean to false as the user released the mouse and the points/line/object has been established 
		drag = false;
	}

	/**
	 * imported for MouseListener
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * imported for MouseListener
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * imported for MouseListener
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * ADDED BY SNEHA KANAUJIA
	 * imported for MouseMotionListener
	 * Detects when user is dragging from a point
	 * Intended to show the user the line/object they are creating as they draw
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		// saves the current mouse position values while the mouse is still pressed/dragging to the class-wide release X and Y variables
		releaseX = e.getX();
		releaseY = e.getY();

		//set boolean to true so that in paint it may draw a line from the start point to "end" point/current mouse location
		drag = true;
		repaint();
		
	}

	/**
	 * imported for MouseMotionListener
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
