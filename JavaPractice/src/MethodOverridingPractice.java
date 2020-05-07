
// when there is a method with same name in both super and sub class, if we create object for sub in main method, then the method in sub overrides the method in super.
//Above is called method overriding. To refer the method of superclass in subclass, we can use super keyword. (super.show()) or super.i;
class A {
	int i;
	public void show()
	{
		System.out.println("in A");
		System.out.println(i);
	}
}
	
	
	
class B extends A {
int i;

	public void show() {
		super.i=8; //this refers the variable in super class
		i=9; // this refers the variable in sub class
		super.show(); //this refers the method in super class
		System.out.println("in B");
	}

}

public class MethodOverridingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	B obj=new B();
	obj.show();
	
	}

}
