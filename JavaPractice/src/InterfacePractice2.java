//Abstract class = can define and declare methods.
//interface -  we can declare methods only till 1.7.
//with the latest version of java, we can also define methods.
//functional interface can have only one abstract method, but can be any number of dafult methods.
//Default methods can be override

interface Demo{
	void abc();
	default void show() {
		System.out.println("In show");
	}
	
	default void display() {
		System.out.println("In display");
	}
}

class imple implements Demo{

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("in abc");
	}
	
	public void display () {
		System.out.println("defauilt method overriding");
	}
		
}
public class InterfacePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new imple();
		obj.abc();
		obj.show();
		obj.display();
	
		
	}

}
