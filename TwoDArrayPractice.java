public class TwoDArrayPractice
{
	public static void main(String[] args)
	{
		int[][] array = new int[4][2]; // creates 2D array with 4 spots, with array of leng 2 in each spot 
		int arrLen = array[0].length;  // finds length of the array in the array 
		
		int[][] arr = new int[3][4];
		printArray(arr);	// goes to int[][] printArray
		
		String[][] arr1 = new String[3][3];
		printArray(arr1); 	// goes to String[][] printArray
		
		int[][] createdArr = create2D();
		printArray(createdArr);
		
		int[][] nArray = create2DWithN(100);
		printArray(nArray);
		printNice(nArray);
	}
	
	/**
	 * prints a 4 X 4 array with ascending values using nested for loops
	 * @return the changed 2D array
	 */
	public static int[][] create2D()
	{
		int[][] arr = new int[4][4];
		int count = 1; 
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				arr[row][col] = count;
				count++;
			}
		}
		return arr; 
	}
	
	/**
	 * prints an n X n array as specified by the user using nested for loops
	 * @param int n of the dimensions the user wants
	 * @return changed 2D array
	 */
	public static int[][] create2DWithN(int n)
	{
		int[][] arr = new int[n][n];
		int count = 1; 
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				arr[row][col] = count;
				count++;
			}
		}
		return arr; 
	}
	
	/** 
	 * prints array nicely, compensating for size of array so that all columns are aligned
	 * @param int[][] array to be printed
	 make formatting, compensate for size (100x100)
	 */  
	public static void printNice(int[][] arr)
	{
		int greatestNum = arr.length  * arr.length;
		int greatestLen = String.valueOf(greatestNum).length();
		for (int row = 0; row < arr.length; row++)
		{
			System.out.print("|");
			for (int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col]);
				int lengthNum = String.valueOf(arr[row][col]).length();
				while (lengthNum < greatestLen)
				{
					System.out.print(" ");
					lengthNum++;
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////
	
	/** 
	 * prints the values of an int[][] array using nested for loops
	 * @param int[][] arr
	 */
	public static void printArray(int[][] arr)
	{
	
			
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	// overload method, the computer will know which printArray to use	
	/** 
	 * prints the values of an String[][] array using nested for loops
	 * @param String[][] arr
	 */
	public static void printArray(String[][] arr)
	{
	
			
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}