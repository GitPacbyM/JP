//Encapsulation - Binding data with methods.
class stu{
	private int i;
	private String name;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}


public class EncapsulationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	stu s=new stu();
	s.setI(4);
	System.out.println(s.getI());
	s.setName("Navin");
	System.out.println(s.getName());
	
	
	}

}
