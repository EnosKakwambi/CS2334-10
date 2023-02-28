
public class Driver {

	public static void main(String[] args) {

		//		L3 ref1 = new L3(); // Upcasting
		//		//ref1.display();
		//		L3 ref2 = null;
		//		
		//		
		//		if(ref1 instanceof L3) {	// false is ref1 was not an instance of L3			
		//			ref2 = (L3) ref1;	// Will throw exception if ref1 is not an instance of L3
		//
		//			ref2.anotherDisplay();
		//		}
		//		
		//		ref1.anotherDisplay();

		//L3 ref2 = null;

		//System.out.println(ref1 instanceof L3);

		//ref1.display();

		/*
		if(ref1 instanceof L3) {	// false is ref1 was not an instance of L3			
			ref2 = (L3) ref1;	// Will throw exception if ref1 is not an instance of L3

			ref2.anotherDisplay();
		}
		 */


		// Static methods can be accessed without creating objects!
		//System.out.println(L3.doubleIt());


		//Cloneable Demo


		//		Rectangle a = new Rectangle(4,5);
		//
		//		//Rectangle b = a;
		//
		//		Rectangle b = (Rectangle) a.clone();
		//
		//
		//
		//		if (b != null) {
		//
		//			a.setDimensions(1, 1);
		//
		//			System.out.println(a.area());
		//			System.out.println(b.area());	// When is area different?
		//
		//		}

		Vehicle vehicle1 = new Vehicle("Generic", "Vehicle", 2023);
		Car car1 = new Car("Toyota", "Corolla", 2022, 4);
		Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Softail", 2020, "Cruiser");

		// Polymorphism example
		Vehicle[] vehicles = { vehicle1, car1, motorcycle1 };

		for (Vehicle v : vehicles) {
			System.out.println("Make: " + v.getMake());
			System.out.println("Model: " + v.getModel());
			System.out.println("Year: " + v.getYear());
			v.start();
			if (v instanceof Car ) {
				Car temp = (Car) v;
				System.out.println("Doors: " + temp.getNumDoors());
			}
			System.out.println();
			
		}


	}

}
