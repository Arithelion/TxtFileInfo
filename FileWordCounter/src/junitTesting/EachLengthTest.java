package junitTesting;



import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import wordCounterApp.EachLength;
import wordCounterApp.WordLength;

/*
 * Test to check the output of Each Length has been printed correctly. 
 * This does not run any assertEquals commands, simply just prints out the
 * expected and actual results for the tester to compare the output to ensure
 * the logic is correct.
 * Text in test.txt: Hello world & good morning. The date is 18/05/2016
 * Characters Removed by Regex: ,.;:\"*?!'
 */

class EachLengthTest {

	@Test
	public void EachLengthtest() throws Exception
	{
		 //bring file in instead of user argument input
		String Filename = "C:\\Users\\Aidan\\Desktop\\test.txt";
		//assign it to WordLength so it can run
		WordLength.SetArgs(Filename);

		//Assign Variable
		ArrayList<Integer> CheckedArray = new ArrayList<Integer>();
		ArrayList<Integer> TestingArray = new ArrayList<Integer>();
		
		//Actual Array Entries
		TestingArray = WordLength.LengthArray(null);

		//Expected Array Entries
		CheckedArray.add(5);
		CheckedArray.add(5);
		CheckedArray.add(1);
		CheckedArray.add(4);
		CheckedArray.add(7);
		CheckedArray.add(3);
		CheckedArray.add(4);
		CheckedArray.add(2);
		CheckedArray.add(10);
		
	
		//Expected Result
		System.out.println("EXPECTED RESULT");
		EachLength.EachLengthArray(CheckedArray);
		
		//Actual Result
		System.out.println("ACTUAL RESULT");
		EachLength.EachLengthArray(TestingArray);
		
		
		
	}

}
