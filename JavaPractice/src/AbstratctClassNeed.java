
abstract class writer
{
	public abstract void thick(Number i);
	
}
class pen extends writer{
	public void thick(Number i) {
		System.out.println(i);
	}
}

class pencil extends writer{
	public void thick(Number i) {
		System.out.println(i);
	}
	
}

class printer
{
	/*
	 * public void show(Integer i) { System.out.println(i); }
	 * 
	 * public void show(Double d) { System.out.println(d); }
	 */
	
	public void show (Number i)
	{
		System.out.println(i);
	}
}


public class AbstratctClassNeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printer obj = new printer();
		obj.show(7);
		obj.show(5.5);
		writer obj1 = new pen();
		obj1.thick(5.25);
		writer obj2 = new pencil();
		obj2.thick(2.4355);
		
		
	}

}
