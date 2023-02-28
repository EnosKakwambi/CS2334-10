
/** 
* Rectangle Class
*/

public class Rectangle implements Cloneable { //Cloneable Demo Class

	private double length, breadth;
	
	/** 
	Class constructor
	*/
	public Rectangle (double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double area() {
		double area = length * breadth;
		return area;
	}

	public void setDimensions(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Object clone() {

		// Rectangle r = new Rectangle(this.length, this.breadth);
		
		Rectangle r = null;
		try {
			r = (Rectangle) super.clone(); // Magic	(close enough)
			
		}
		catch (Exception e) {
			System.out.println("Cloning Failed");
		}

		return r;
	}
}
