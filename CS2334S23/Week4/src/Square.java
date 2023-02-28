
public class Square extends Rectangle {
	
	//private double side;
	
	public Square (double side) {
		super(side, side);
		//this.side = side;
	}
	
	public double[] sides() {
		double[] t = {1.0,1.0};		
		return t;		
	}
	
	public String toString()
    {
    	return ("This is a Square object.");
    }
	
	
//	@Override
//	public double area() {
//		
//		double area = side * side;
//        return area;
//		
//	}
	

}
