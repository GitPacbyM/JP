
public class BreakAndContinue {
	
	//break, continue
	
	public static void main(String args[]) {
		
		for (int i=1;i<10;i++) {
			if (i==7)
			{
				continue;
			}
			
			System.out.println("The value of i is " +i);
		}
		
		for (int j=1;j<10;j++) {
			if (j==6) {
				break;
			}
			
			System.out.println("The value of j is "+j);
		}
	}

}
