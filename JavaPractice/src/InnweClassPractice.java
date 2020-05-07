/*
 *  Inner Class
 *  member class (for member class, we have to use the object  of the class)
 *  Static class (for static class, need not to use the object)
 *  Anonymous class (can be seen later
 
*/

class Outer {
	static int i;

	public static void show() {
		System.out.println("In outer static class");
	}

	static class inner { // outer$inner class

		public void display() {

			System.out.println("inner demo");
		}

	}

}


public class InnweClassPractice {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.i = 5;
		Outer.show();
 
		Outer.inner obj1 = new Outer.inner();
		obj1.display();
 
 	}

}
