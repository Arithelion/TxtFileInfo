package wordCounterApp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordLength 
{
	//Global Variable for the input of User Argument Input
	private static String S;

	public static void SetArgs(String S) 
	{
		//Setter
		WordLength.S = S;
	}
	
	public static String GetArgs()
	{
		//Getter
		return S;
	}
	public static  ArrayList<Integer> LengthArray (ArrayList<Integer> Y) throws Exception
	{
	//Variables
	int WordLengthCount = 0;
	ArrayList<Integer> NumArray = new ArrayList<Integer>();
	String FileName = S;
	File file = new File(FileName);
	Scanner Import = new Scanner(file);
	
		//While Loop to go through each word count its length and add it to Arraylist
		//and then using ReplaceAll removes user defined unnecessary characters from regex from word length
		try 
		{
			while(Import.hasNext())
			{
				String Word = Import.next();
				String FinalWord  = Word.replaceAll("[,.;:\"*?!']", "");
				WordLengthCount = FinalWord.length();
					
				if (WordLengthCount != 0) 
				{
					NumArray.add(WordLengthCount);
					//failsafe as the above regex will not remove but add a "0" to the array
				}
			}
				
		}
			catch(Exception e)
			{
				System.out.println("File reading failed");
			}
		
	Import.close();
	return NumArray;

	}
}
