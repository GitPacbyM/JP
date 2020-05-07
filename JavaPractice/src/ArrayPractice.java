
class Student{
	
	int rollno;
	String name;
}


public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D Array
		int num[] = new int[4]; //Array declaration way 1
		num[0] = 12;
		num[1] = 24;
		num[2] = 36;
		num[3] = 42;
		
		int num1[] = {2,4,8,20,12}; //Array declaration way 2
		//Array of Objects
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		
		Student s[] = new Student[4];
		//we can also create array of objects like below also
		Student h[] = {s1,s2,s3,s4};
		
				
		for (int i=0;i<4;i++) {
			System.out.print(num[i]);
		
			System.out.print(num1[i]);

		}
		
		//Enhanced for loop
		
		for (int i : num1) {
			
			System.out.print(" " +i);
			
		}
		
		
	}

}
