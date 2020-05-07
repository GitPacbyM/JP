//We can create object of interface with the help of anonymous class
//Advantages of interface
//it doesn't take lot of memory. This would be used only in particular class. It cannt be resused.

interface R {
	void show();
}

public class AnonymousClass1 {

	public static void main(String[] args) {

		R obj = new R() 
					{
						public void show() 
						{
							System.out.println("in Anonymous class");
						}
					};

	}

}
