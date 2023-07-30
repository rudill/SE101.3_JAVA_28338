
import java.util.Scanner;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandle {
    public static void main(String[] args) {

        try{
        File myFile = new File("new.txt");
        File myFile1 = new File("file2.txt");
       
       
        myFile.createNewFile();
        System.out.println("File name is -> "+myFile.getName()); // Creating files
        myFile1.createNewFile();
        System.out.println("File name is -> "+myFile.getName());

        Scanner scan = new Scanner(myFile);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
       
        }
        catch(IOException  e){
            
            System.out.println("Error !");

            System.out.println("File not found ");


        }
        
        
        

    
    
    
        }
        
        
    }
