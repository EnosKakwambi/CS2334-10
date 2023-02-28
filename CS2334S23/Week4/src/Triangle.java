
public class Triangle extends Shape {

	private double sideA, sideB, sideC;
	
	public Triangle (double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	@Override
	public double area() {
		
		double s = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
		
	}
	
	public double[] sides() {
		double[] t = {sideA,sideB,sideC};		
		return t;		
	}

}
