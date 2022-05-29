package com.booking.service;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookingService {
	
	public ArrayList<Integer> getAllAvailableSeats(String movieName, String location, String movieTime){
		
		ArrayList<Integer> temp = new ArrayList<Integer>();

		String name = movieName;
		String selectedTime = returnFileName(movieTime);
		File selectedTimeFile = new File(selectedTime);



		if (selectedTimeFile.exists())
		{

			try{

 			FileInputStream fs = new FileInputStream(selectedTimeFile.toString());
  			DataInputStream in = new DataInputStream(fs);
  			BufferedReader br = new BufferedReader(new InputStreamReader(in));
  			String stringLine;

  			while ((stringLine = br.readLine()) != null)
  			{
  				String[] array = stringLine.split(";");

				// For every object in the array, built from items in the text file
  				for (int i=0; i < array.length; i++)
  				{
					// Convert the item to an integer
	  				Integer num = Integer.parseInt(array[i]);

	  				// Add Item to arraylist to be returned
	  				temp.add(num);
  				}
  			}

  			in.close();

    			}catch (Exception ex){System.err.println(ex.getMessage());}

		}
		return temp;
		
	}
	
	public static String returnFileName(String input)

	{
		String timeFileName  = input;

		if (input.equals("1.00 PM"))
		{
			timeFileName = "SEAT DATABASE 1.00 PM.txt";
		}
		else if (input.equals("3.00 PM"))
		{
			timeFileName= "SEAT DATABASE 3.00 PM.txt";
		}
		else if (input.equals("5.00 PM"))
		{
			timeFileName= "SEAT DATABASE 5.00 PM.txt";
		}
		else if (input.equals("7.00 PM"))
		{
			timeFileName = "SEAT DATABASE 7.00 PM.txt";
		}
		else if (input.equals("9.00 PM"))
		{
			timeFileName= "SEAT DATABASE 9.00 PM.txt";
		}

		return timeFileName;
	}

}
