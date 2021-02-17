package wordCounterApp;



import java.util.ArrayList;







/* 
 * Author: Aidan Garnett.
 * 
 * 
 * Program to read a text file and give a word count and information about the word lengths.
 * 
 * 
 * Referenced:
 * https://www.tutorialspoint.com/How-to-count-the-number-of-words-in-a-text-file-using-Java
 * https://www.dotnetperls.com/arraylist-integer-java
 * https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
 * https://www.geeksforgeeks.org/count-occurrences-elements-list-java/
 * https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
 * https://stackoverflow.com/questions/11943948/what-causes-unable-to-access-jarfile-error?rq=1
 * https://www.w3schools.com/java/java_user_input.asp
 */

public class TotalCount
{
	
	
	
	public static void main(String args[]) throws Exception
	{
		//Initialise WordLength Object
		// Counter Variables
		int Counter = 0;
		float AvrgCount = 0;
		String FileLocation = args[0];
		WordLength.SetArgs(FileLocation);
			
			
		
		//system output: calling other classes to bring information needed
		// Eachlength is null as it is looping output and printing on its own
			try 
			{
				System.out.println("Word Count = " + TotalCount.Total(Counter));
				System.out.println("Average Word Length = " + AvrgLength.Avrg(AvrgCount));
				EachLength.EachLengthArray(WordLength.LengthArray(null));
			} 
				catch(Exception e)
				{
					System.out.println("Output Failed");
				}
	
	}
	
	
	
	public static int Total(int T) throws Exception 
	{
		
		
		//Variables
		int Count = 0;
		ArrayList<Integer> TotalArray = new ArrayList<Integer>();
		
			try
			{
				//bring in ArrayList of Lengths
				TotalArray = WordLength.LengthArray(null);
			}
				catch(Exception e)
					{
						System.out.println("Calling WordLength class failed");
					}
		//Assign size to integer to return for printing
		Count = TotalArray.size();
	
		return Count;
			
	}
		

}






