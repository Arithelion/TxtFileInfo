package junitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wordCounterApp.WordLength;

/*
 * Test to check that the Set and Get in Wordlength 
 * correctly parse Users input into Wordlength class.
 * Text in test.txt: Hello world & good morning. The date is 18/05/2016
 * Characters Removed by Regex: ,.;:\"*?!'
 */

class WordLengthSetArgsTest {

	@Test
	public void testSetGet()
	{
		//Suedo User Input
		String Filename = "C:\\Users\\Aidan\\Desktop\\test.txt";
		//Setting String
		WordLength.SetArgs(Filename);
		//Bringing String back to be checked
		String FileNameCheck = WordLength.GetArgs();
		//Checking it equals original input
		assertEquals(FileNameCheck, Filename);
		System.out.println("File Path sent: " + Filename);
		System.out.println("File Path called: " + FileNameCheck);
	}

}
