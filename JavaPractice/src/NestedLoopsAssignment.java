
public class NestedLoopsAssignment {
	
	public static void main(String args[]) 
	{
		//Assignment 1
		//nested loops
		
		for (int x = 1; x <= 4; x++) {
			System.out.println(x+ " ");
			if(x==4) {
				continue;				
			}
			for (int z=1; z<=x;z++) {
				System.out.print(z+"");
			}
		}	
		
		
		
		  //Assignment 2 
			for (char s = (int) 65; s < 69; s++) {
				System.out.println(s);
				for (char l = (int) 65; l <= s; l++) {
					System.out.print(l);
				}

			}
		 
	}

}
