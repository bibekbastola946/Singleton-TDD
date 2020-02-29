/*
@w0677115
@Bibek Bastola
@CMPS 415
@Dr. John Burris
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MyFileWriter {
	private static MyFileWriter obj=null;
	private static BufferedWriter writer;
	private static String fileName;
	Date date = new Date();
	private MyFileWriter() throws IOException {
     fileName =  "test.txt";
      writer = new BufferedWriter(new FileWriter (fileName));
}
	public static MyFileWriter getInstance () throws IOException{
        if (obj == null)
	            obj = new MyFileWriter();
	        return obj;
  }
    public void write(String string) throws IOException {
    	
    	writer.write(string);
    	writer.append("Finally!!!" + date);
    	            
    }
    public void close () throws IOException{
        writer.close();
    }
    // for JUnitTest To show that the text inside the filename is same as in the program
	public String getvalue() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String appendedText = reader.readLine();
		reader.close();
		return appendedText;
		
	}
    
    
}
