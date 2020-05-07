
// when local variable and instance variables are same, to refer the instance variables, we use this keyword.
class Csio {
	 
	 int num1; //Instance variables
	 int num2;
	 int result;

			
		public Csio(int num1, int num2)//local variables 
		{
			this.num1=num1; //current object
			this.num2=num2;
			
		}

		
}
public class ThisKeywordPractice {

	public static void main(String args[]) {

		Csio obj = new Csio(7,8);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
