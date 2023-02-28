import java.util.ArrayList;

public class Driver {
	public static void main(String[] args)
	{

		//Child child = new Child(9);

		//System.out.println(child);



		Shape t = new Triangle(3,4,5); // upcasting
		Shape r = new Rectangle(4,5);
		Shape s = new Square(5);
		Shape c = new Circle(5);

		//System.out.println(s);

		//		if (c instanceof Triangle) {
		//			
		//			Triangle temp = (Triangle) t;	// downcasting			
		//
		//			double[] arr = temp.sides();
		//			
		//			for (int i = 0 ; i < arr.length; i++) {
		//				System.out.println(arr[i]);
		//			}
		//			
		//		}



		//
		//		System.out.println(t.area());
		//		System.out.println(r.area());
		//		System.out.println(s.area());
		//		System.out.println(c.area());



		//System.out.println(t);


		/*
		ArrayList<Shape>  myShapes =  new ArrayList<Shape>();

		myShapes.add(t); //upcasting
		myShapes.add(r);
		myShapes.add(s);
		myShapes.add(c);

		for (int i = 0; i < myShapes.size(); i++) {

			System.out.println("Area of shape " + i + ": "+ myShapes.get(i).area());

			if (myShapes.get(i) instanceof Triangle) {
				Triangle temp = (Triangle) myShapes.get(i);	//downcasting			
				System.out.println("The three sides are: " + temp.sides()[0] + ", " + temp.sides()[1] + ", " + temp.sides()[2]);
			}

			if (myShapes.get(i) instanceof Rectangle) {
				Rectangle temp = (Rectangle) myShapes.get(i);				
				System.out.println("The two sides are: " + temp.sides()[0] + ", " + temp.sides()[1]);
			}

			if (myShapes.get(i) instanceof Circle) {
				Circle temp = (Circle) myShapes.get(i);				
				System.out.println("The radius is: " + temp.radius());
			}

		}
		 */


		// Why is the behavior different for these two cases?

		Child a = new Child(7);
		System.out.println(a);
		System.out.println(a.data);

		Parent b = new Child(7); // Upcasting
		System.out.println(b);
		System.out.println(b.data);

	}
}
