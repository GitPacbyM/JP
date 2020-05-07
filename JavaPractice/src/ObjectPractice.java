//constructor overloading
 class Calc {
	 
	 int num1;
	 int num2;
	 int result;

		public Calc() {
			num1 = 5;
			num2 = 5;
			System.out.println("in constrictor");
		}

		public Calc(int number1) {
			num1 = number1;
		}
		
		public Calc (int k, int j) {
			num1=k;
			num2=j;
			result = j+k;
			
		}
		
		public Calc(double d) {
			num1 = (int) d;
		}

}




public class ObjectPractice {
	
	public static void main(String args[]) {
		
		Calc obj = new Calc(8.9);
		System.out.println(obj.num1);
		

		
		
	}

}
