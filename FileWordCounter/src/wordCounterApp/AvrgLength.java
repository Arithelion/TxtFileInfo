package wordCounterApp;

import java.util.ArrayList;

public class AvrgLength 
{
	
	
	public static double Avrg (double x) throws Exception
	{
	
		//Variables
		 ArrayList<Integer> AvrgArray = new ArrayList<Integer>();
		 float Sumup = 0;
		 float FinalAvrg = 0;
		 double RoundAvrg = 0;
	
			try
			{
				//bring in word lengths from word length class
				AvrgArray = WordLength.LengthArray(null);
			
				 //For loops through the array of word lengths and added them together in the Sumup Variable
				 for(int i=0;i<AvrgArray.size();i++)
				 {
					Sumup = Sumup + AvrgArray.get(i);
				 }
			}
				catch (Exception e)
				{
					System.out.println("Average Length calculation failed");
				}
			
		 //Average calculation then round up for 3 decimal places
		 FinalAvrg =  Sumup / AvrgArray.size();
		 RoundAvrg = Math.round(FinalAvrg * 1000.0) / 1000.0;
		
		 return RoundAvrg;		
	}
}