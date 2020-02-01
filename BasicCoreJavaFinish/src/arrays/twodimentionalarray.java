package arrays;

public class twodimentionalarray {

	public static void main(String[] args) {
		
		String[][] arr= new String[3][2];
		
		//Row 1
		arr[0][0]="Sneha";
		arr[0][1]="Apoorva";
		
		//Row 2
		arr[1][0]="Pallavi";
		arr[1][1]="Prachi";
		
		//Row 3
		arr[2][0]="Abhishek";
		arr[2][1]="Yogesh";
		
		for(int r=0; r<arr.length; r++)
			
		{
			for(int c=0; c<arr[r].length; c++)
				
			{
				System.out.print(arr[r][c]+" || ");
			}
			
			System.out.println();
		}
		
	}

}
