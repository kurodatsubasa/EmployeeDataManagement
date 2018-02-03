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

import java.util.ArrayList;

public class EmployeeRecords {

    private ArrayList<Employee> records;

    // default constructor
    public EmployeeRecords() {
        records = new ArrayList<>();
    }

    // search functions should be designed here

    // Getters and Setters for records
    public ArrayList<Employee> getRecords() {
        return records;
    } // end getRecords

    public void setRecords(ArrayList<Employee> records) {
        this.records = records;
    } // end setRecords
} // end EmployeeRecords
