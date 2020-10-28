package com.Encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotepadFile {

	public static void main(String[] args) {
		
		BufferedReader reader ;
		
		try {
			
			reader =  new BufferedReader(new FileReader("G:\\Recent 3\\Recent final All videos\\BITM\\class11\\Password_data.txt"));
			String line = reader.readLine();
			
			
			while(line!= null)
			{
				System.out.println(line);
				
				//To read next line 
				
				line = reader.readLine();
			}
			
			reader.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	


}
