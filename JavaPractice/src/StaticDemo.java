
class Emp {
	int eid;
	int salary;
	static String ceo;

	static // this will be executed when you load the class. Class is loaded only once
	{
		ceo = "Nikita";
		System.out.println("in static class");
	}

	public Emp() // this will be executed when you create object
	{
		eid = 1;
		salary = 1000;
		System.out.println("In Constructor");

	}

	public void show() {
		System.out.println(eid + " : " + salary + "; " + ceo);
	}

}

public class StaticDemo {
// if you want to call a method without object, we can simply declare it as static.
	static int i; // cannt use the non static variables inside a static method. So need to declare the variable as static to use inside a static method.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		i = 5;
		Emp Navin = new Emp();
		Navin.eid = 8;
		Navin.salary = 2000;
		Emp.ceo="Mahesh";// to use static variable, we do not need object name(Navin). We use the class(Emp) name directly

		Emp Rajesh = new Emp();
		Rajesh.eid = 9;
		Rajesh.salary = 5000;

		Navin.show();
		Rajesh.show();

	}

}
