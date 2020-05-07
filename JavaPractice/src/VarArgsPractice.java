
//variable length args - varargs
class calc1{
	public int add (int ... n) {
		
	int sum=0;
	for (int i:n) {
		sum=sum+i;
	}
	return sum;	
	}
}
public class VarArgsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	calc1 obj = new calc1();
	int result = obj.add(12,24,36,48,60); 
	//When the number of arguments we are passing for a method are not same or constant, then we can use this varargs
	
	System.out.println(result);
	
	
	
	
	}

}
