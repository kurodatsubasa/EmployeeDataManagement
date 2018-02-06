/*
 * Hai Le, Bjorn Shroda
 * 02/06/18
 * Program 2
 * The purpose of this program is to organize the data of employees by storing
 * their personal information and by calculating their salary based on their title.
 * The program is expected to provide a search function to loop-up any employee
 * by ID or with a given title.
 */
package program2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileIO {
    // this method reads the file with employee info and initializes 
    static void readFile(String fileName, EmployeeRecords records) {
        // to store current read-in line from the file
        String currentLine = null;
        
        // try catch block 
        try (BufferedReader input = new BufferedReader(new FileReader("employeeData.txt"))) {
            // read each employee record line by line until the end of file
            while ((currentLine = input.readLine()) != null) {
                // each field for employee record is separated by ;
                String[] fields = currentLine.split(";");
                // add a new entry to employee records
                records.addRecord(fields);
                System.out.println(fields[0].length());
            } // end While
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } // end catch
    } // end readFile
} // end FileIO
