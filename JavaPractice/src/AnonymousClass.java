// when the only purpose of class is to override a method, we can use anonymous class while creating object.
//we can create anonymous class by sepcifying the object and then the class 
// with normal class, we first create class,  and then create the object of it.
// but with anonymous class, we first create object and specify implementation of it like what the object does 
class P
{
	public void show() 
	{
		System.out.println("in show A");
	}
}

/*
 * class Q extends P { public void show() { System.out.println("in show B"); } }
 */
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P obj = new P() 
			{ // below class is now abstract class.
				public void show() {
				System.out.println("in show B");
			}
		};
	obj.show();
	}

}
