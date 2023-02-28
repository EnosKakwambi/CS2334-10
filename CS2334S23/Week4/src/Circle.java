
public class Circle extends Shape {
	
	private double radius;
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		double area = Math.PI * radius * radius;
        return area;
		
	}
	
	public double radius() {
		return radius;		
	}
}
