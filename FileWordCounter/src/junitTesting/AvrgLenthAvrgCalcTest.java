package junitTesting;

/*
 * Test to check that the average calculation method
 * works correctly against expected result
 * Text in test.txt: Hello world & good morning. The date is 18/05/2016
 * Characters Removed by Regex: ,.;:\"*?!'
 */


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import wordCounterApp.AvrgLength;
import wordCounterApp.WordLength;

class AvrgLenthAvrgCalcTest {

	@Test
	public void AvrgCalctest() throws Exception 
	{
		 //bring file in instead of user argument input
		String Filename = "C:\\Users\\Aidan\\Desktop\\test.txt";
		//assign it to WordLength so it can run
		WordLength.SetArgs(Filename);
		
		//Assign  variables
		double TestAvrg = 0;
		double FinalTestAvrg = 0;
		double CheckAvrg = 0;
		double Roundup = 0;
		ArrayList<Integer> CheckedArray = new ArrayList<Integer>();

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
		
		//bring in Expected Result
		CheckAvrg = AvrgLength.Avrg(0);

		
		//Loop
		for(int i=0;i<CheckedArray.size();i++)
		{
			TestAvrg = TestAvrg + CheckedArray.get(i);
		}
		
		//Average calculation then round up for 3 decimal places
		FinalTestAvrg =  TestAvrg / CheckedArray.size();
		Roundup = Math.round(FinalTestAvrg * 1000.0) / 1000.0;
		
		System.out.println("Expected: " + Roundup);
		System.out.println("Actual " + CheckAvrg);
		assertEquals(Roundup, CheckAvrg);

		
	}
	
	
}
