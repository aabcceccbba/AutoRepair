package auto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Instrument {
	
	public static void write(String fileName) {
		String line = null;
		File fout = new File("out.py");
		int i = 0;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fout);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader br = new BufferedReader(fileReader);

            while((line = br.readLine()) != null) {
            		i++;
            		String newline = line + "   # this is line " + i;
            		// test on console
            		System.out.println(newline);
            		bw.write(newline);
            		bw.newLine();
            }   

            br.close();
            bw.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to find file '" + fileName + "' in the current directory.");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
            // ex.printStackTrace();
        }
	
	 
	}

	public static void main(String args[]) {
		// read a python file and add instrument to out.py
		if(args.length > 0) {
			write(args[0]);
		}
		else {
			System.out.println("A python file name is needes as command line argument");
		}
	}
}