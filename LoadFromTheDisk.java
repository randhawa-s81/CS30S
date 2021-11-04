import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Harmeet Gill
 *  Class:          CS30S
 * 
 *  Assignment:     Array laod from disk part 1
 * 
 *  Description:    Load an array from disk data
 *                  where the data is one item per line
 * 
 *************************************************************/

public class LoadFromTheDisk {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 100;            // array max size 
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        BufferedReader fin = null;      //input buffer
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;                      // actual size of array
        int[] list = new int[MAX];      // declare and allocate array 
        System.out.println(list);
        
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        try{
        fin = new BufferedReader(new FileReader("Data.txt"));
    }// end try
        catch(FileNotFoundException e){
            System.out.println("file not found");
            fin = null;
        }// end catch
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Harmeet" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Load Array From Disk Example 1" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
        strin = fin.readLine();       // get the first datum
    
        while(strin != null){
            //System.out.println(strin);
            
            // parse data into the array 
            list[n++] = Integer.parseInt(strin);
            
            strin = fin.readLine();
        }// end while
        
    // ***** Print Formatted Output *****
    
        for(int i = 0; i < n; i++){
            System.out.print(list[i] + ", ");
            
            if(i % 11 == 10)
                System.out.println();
        }// end for
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
