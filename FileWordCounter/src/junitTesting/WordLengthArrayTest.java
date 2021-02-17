package junitTesting;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import wordCounterApp.WordLength;

/*
 * Test to check that the Array in Wordlength 
 * is adding word lengths correctly.
 * Text in test.txt: Hello world & good morning. The date is 18/05/2016
 * Characters Removed by Regex: ,.;:\"*?!'
 */

class WordLengthArrayTest {

	@Test
	public void testArray() throws Exception
	{
		 //bring file in instead of user argument input
		String Filename = "C:\\Users\\Aidan\\Desktop\\test.txt";
		//assign it to WordLength so it can run
		WordLength.SetArgs(Filename);
		//Creating Test Arrays
		ArrayList<Integer> TestingArray = new ArrayList<Integer>();
		ArrayList<Integer> CheckArray = new ArrayList<Integer>();
		
		//Adding Expected Results
		CheckArray.add(5);
		CheckArray.add(5);
		CheckArray.add(1);
		CheckArray.add(4);
		CheckArray.add(7);
		CheckArray.add(3);
		CheckArray.add(4);
		CheckArray.add(2);
		CheckArray.add(10);
		
		//Loop through brought in array data and testing it against expected results
		TestingArray = WordLength.LengthArray(null);
		for(int i=0;i<TestingArray.size();i++)
		{
			assertEquals(CheckArray.get(i), TestingArray.get(i));
			System.out.println(CheckArray.get(i) + " = " + TestingArray.get(i));
		}
		
	}

}
