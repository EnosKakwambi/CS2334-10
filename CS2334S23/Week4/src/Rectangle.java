
public class Rectangle extends Shape {
	
	private double length, breadth;
	
	public Rectangle (double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		
		double area = length * breadth;
        return area;
		
	}
	
	public double[] sides() {
		double[] t = {length,breadth};		
		return t;		
	}
}
