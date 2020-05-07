
//if you declare a class as abstract class, then no one can create object for that class
//If you declare a method as abstract, you cannot define it. Can be defined in the sub class.
// if you make a method as abstract, it is mandatory to make the class as abstract.
//It is not mandatory that if a class is abstract to have the methods also to be abstract.

abstract class human //abstract class
{
	public abstract void eat();
	
	public void walk() {
		
	}
}

class man extends human //concrete class

{
	
	public void eat() {
		
	}
	
}


public class AbstractClassPracrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	human obj = new man();
	
	
	}

}
