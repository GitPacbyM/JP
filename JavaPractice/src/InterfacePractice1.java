

interface Abcc{
	
	void show();
	
}

class implementor implements Abcc{
	public void show()
	{
		System.out.println("in implementor show");
	}
	
}
public class InterfacePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Abcc obj = new implementor();
	obj.show();
	
	}

}
