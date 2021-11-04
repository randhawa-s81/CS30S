import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Samarjeet Randhawa 
 *  Class:          CS30S
 * 
 *  Assignment:     A1.2
 * 
 *  Description:    this program will read in n students records from a data file and store these records in arrays and will do some calculations 
 * 
 *************************************************************/

public class A1_2 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 30;
    
    // ***** variables *****
    
        int n = 0; // actual size of array
        
        // declare arrays 
        String[] names = new String[MAX]; 
        int[] studentId = new int[MAX]; 
        int[] studentGrades = new int[MAX];
        
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("A1TestData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Samarjeet Randhawa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.2" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
    strin = fin.readLine();
    
    n = 0; 
    
    while(strin != null){
        //System.out.println(strin); 
        
        tokens = strin.split(delim);
        
        names[n] = tokens[0]; 
        //System.out.println(names[n]);
        studentId[n] = Integer.parseInt(tokens[1]);
        //System.out.println(studentId[n]);
        studentGrades[n] = Integer.parseInt(tokens[2]);
        //System.out.println(studentGrades[n]);
        studentGrades[n] = Integer.parseInt(tokens[3]);
        //System.out.println(studentGrades[n]);
        studentGrades[n] = Integer.parseInt(tokens[4]);
        //System.out.println(studentGrades[n]);
        
        n++;
        
        strin = fin.readLine();
    }// end eof loop 
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
