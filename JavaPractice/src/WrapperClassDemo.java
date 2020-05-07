
public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=5; //Primitive data type variable
		//Assigning a primitive data type value to a wrapper class
		Integer ii = new Integer(i); //boxing or wrapping. ii is a reference variable
		//Integer() above is called wrapper class. This is java given class
		
		int j = ii.intValue(); //unboxing or unwrapper
		//Taking the value back from abstract class to a primitive data type variable.
		System.out.println(j);
		
		Integer value = i; // Though we do not create object hear using new Integer() java automatically deos this. This is called autoboxing;
		int x = value;
		System.out.println(x);
		//when it comes speed, primitive works faster than wrapper class. But there are some frame works like hibernet orcollection API frameworks, need to work with wrapper classes only. These doesnt support primitive dta types.
		
		String str = "123";
		
		int h = Integer.parseInt(str); //Parseint takes the string and converts that into integer format.
		
		System.out.println(h);
		System.out.println(str);
		
				
	}

}
