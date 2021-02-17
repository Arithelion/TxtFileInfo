package wordCounterApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EachLength 
{

	public static void  EachLengthArray (ArrayList<Integer> EachLengthArrayResult) 
	{
		
		//Variables
		Set<Integer> EachWrdLngth = new HashSet<Integer>(EachLengthArrayResult);
		Integer max = 0;
		ArrayList<Integer> KeyMax = new ArrayList<Integer>();
		
		 
		//Creates a Hashset with the entries of the arraylist which are the word lengths, then counts the occurring frequency of each length  	
		for (int EachLngthCount : EachWrdLngth)
		{
			System.out.println("Numbers of words of length " + EachLngthCount + " is " + Collections.frequency(EachLengthArrayResult, EachLngthCount));
			//constantly updating the max to the highest number as it goes through the loop
			if (max == 0) 
			{
				max =  Collections.frequency(EachLengthArrayResult, EachLngthCount);
			}
				else if(max < Collections.frequency(EachLengthArrayResult, EachLngthCount)) 
				{
					max = Collections.frequency(EachLengthArrayResult, EachLngthCount);			
				}
			
				
					//each time a frequency equals max add it to the KeyMax array
					if(max.equals(Collections.frequency(EachLengthArrayResult, EachLngthCount)))
					{
						KeyMax.add(EachLngthCount);
					}
						else
						{
							//loop through the array for ones that are no longer equal the max after it changes and remove them
							//start the loop from 1 as no 0 word length but start the variable from 0 to start on index 0 in array
							for(int i = 1;i<KeyMax.size();i++)
							{
				
								KeyMax.remove(i - 1);
			
							}

				
					
						}

		}

		//output as string for main to call
		System.out.println("The most frequently occurring word length is " + max + "," + " for word length(s) " + KeyMax.toString());
	}
}