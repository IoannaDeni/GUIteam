package Application;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

//ADDED BY PROFESSOR LOUIS CONOVER
//3/5/2018

class DB {
	List<Point> db;
	int size;

	DB () {
		db = new ArrayList<Point>(10);
		size = 0;
	}
	
	public void Add (Point p) {
		db.add(p);
		size++;
	}
	
	public Point Get (int i ) {
		return db.get(i);
	}
	
	public int Size () {
		return size;
	}
}
