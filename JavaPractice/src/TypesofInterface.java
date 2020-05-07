// Types of Interfaces
// 1. Normal Interface - In one interface if there are more than 1 mthod.
// 2.Single abstract method - only one method  - Functional Interface (java 1.8) - Lambda expression - came from Scala
// 3.marker interface - no methods
// with latest java version, we have Functional Interface 
//We can only write lambda expression with functional interface (only one method), bcopz otherwise it will be confused on which method to be executed

//@FunctionalInterface
interface types{
	void show();

}
public class TypesofInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		types obj = () -> System.out.println("in Anonymous class"); //lambda expression
		obj.show();
							
						
	}

}
