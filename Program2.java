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

public class Program2 {

    public static void main(String[] args) throws Exception {
        EmployeeRecords records = new EmployeeRecords();
        
        FileIO.readFile("employeeData.txt", records);
        
         records.printRecord(149200);
         records.printRecord("Salaried");
         records.printRecord("Supervisor");
         records.printRecord("Hourly");        
    } // end main
} // end Program2

