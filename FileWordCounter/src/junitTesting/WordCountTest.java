package junitTesting;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import wordCounterApp.TotalCount;
import wordCounterApp.WordLength;
/*
 * Test to Check that the Total Word Count is Correct.
 * Text in test.txt: Hello world & good morning. The date is 18/05/2016
 * Characters Removed by Regex: ,.;:\"*?!'
 */

class WordCountTest {
	 
	 @Test
	public void testTotal() throws Exception 
	 {
		 //bring file in instead of user argument input
		String Filename = "C:\\Users\\Aidan\\Desktop\\test.txt";
		//assign it to WordLength so it can run
		WordLength.SetArgs(Filename);
		//Take total into local Vairable check it equals correctly
		int output = TotalCount.Total(0);
		assertEquals(9, output);
		System.out.println(output);
	 }
	 
}
