package MyAssignment.PercentileRanking;

import java.io.FileWriter;

public class WriteToFile {
	public static void main(String args[]){    
        try{    
          FileWriter outputFile=new FileWriter("C:\\Users\\ankita.srivastava\\Desktop\\OutputFile.txt");    
          outputFile.write("Welcome to javaTpoint.");    
          outputFile.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
}
