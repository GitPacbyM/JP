
public class TwoDArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2D Array
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {7,8,9,5};
		
		int d[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{7,8,9,5}
								
				};

		for (int i = 0; i < 3; i++) // row
		{
			for (int j = 0; j < 4; j++)// column
			{
				System.out.print(" " + d[i][j]);
			}

			System.out.println();
		}
		//when the columns size is not same for all the rows, we can use length of the araay to get the values
		//When the number of columns are not fixed, it is called Jagged Array
		int k[][] = {
				{2,4,8,10},
				{3,6,9},
				{4,8,12,16,20}

				};
		for (int x=0; x<k.length; x++) {
			for (int y=0; y<k[x].length;y++) {
				System.out.print(" "+k[x][y]);
			}
			System.out.println();
		
		}
		//Enhanced for loop
		for(int x[]:k) {
			for (int y:x) {
				System.out.print(" "+y);
			}
			System.out.println();
		}

	}

}
