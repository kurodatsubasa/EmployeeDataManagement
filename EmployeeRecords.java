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
import java.util.Arrays;

// this class is designed to store and manipulate the list of employees
public class EmployeeRecords {

    private ArrayList<Employee> records;

    // default constructor
    public EmployeeRecords() {
        records = new ArrayList<>();
    }

    public void addRecord(String[] employeeData) {
        try {
            // determines the record type by employee's title
            switch (employeeData[0]) {
                case "Hourly":
                    // add a new record for Hourly Employee that has 7 fields
                    records.add(new HrEmployee(employeeData[0], employeeData[1],
                            employeeData[2], Integer.parseInt(employeeData[3]), Integer.parseInt(employeeData[4]),
                            Double.parseDouble(employeeData[5]), Double.parseDouble(employeeData[6])));
                    break;
                case "Salaried":
                    // add a new record for Salaried Employee that has 6 fields
                    records.add(new SalEmployee(employeeData[0], employeeData[1],
                            employeeData[2], Integer.parseInt(employeeData[3]), Integer.parseInt(employeeData[4]),
                            Double.parseDouble(employeeData[5])));
                    break;
                case "Supervisor":
                    // add a new record for Supervisor that has 7 fields
                    records.add(new Supervisor(employeeData[0], employeeData[1],
                            employeeData[2], Integer.parseInt(employeeData[3]), Integer.parseInt(employeeData[4]),
                            Double.parseDouble(employeeData[5]), Double.parseDouble(employeeData[6])));
                    break;
                default:
                    System.out.println("Invalid employee title! The following employee entry could not be added to the records:\n" + Arrays.toString(employeeData) + "\n");
                    break;
            } // end switch
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Data format error! The following employee entry could not be added to the records:\n" + Arrays.toString(employeeData) + "\n");
        } // end catch
    } // end addRecord

    // search by employee id and get a record for that employee
    public Employee getRecordById(int id) {
        for (Employee record : records) {
            // if id matches, return that employee
            if (record.getOwnId() == id) {
                return record;
            } // end if
        } // end for
        return null;
    } // end getRecordId

    // search and get all employees with the given title
    public ArrayList<Employee> getRecordByTitle(String title) {
        // to store employees
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee record : records) {
            // if title matches, add that employee to arraylist
            if (record.getTitle().equalsIgnoreCase(title)) {
                list.add(record);
            } // end if
        } // end for
        return list;
    } // end getRecordTitle

    // search by supervisor's id and get list of subordinate's ids of that supervisor
    public String getSubsId(int id) {
        // to store list of ids
        StringBuilder list = new StringBuilder();
        for (Employee record : records) {
            // if supervisor id matches, add that employee id to the list
            if (record.getBossId() == id) {
                list.append(record.getOwnId()).append(" ");
            } // end if
        } // end for
        return list.toString();
    } // end end getSubsId

    // display employee list by title
    public void printRecord(String title) {
        ArrayList<Employee> list = getRecordByTitle(title);
        // if employee or employees with the given title found
        if (list.size() > 0) {
            for (Employee employee : list) {
                // determine type of employee by their title
                switch (title) {
                    case "Hourly":
                    case "Salaried":
                         System.out.printf("%-18s %d %8.2f\n", employee.getName(), 
                                 employee.getOwnId(), employee.getGrossWeeklyPay());
                        break;
                    case "Supervisor":
                        System.out.printf("%-18s %d %8.2f %s\n", employee.getName(), employee.getOwnId(), employee.getGrossWeeklyPay(),
                                 getSubsId(employee.getOwnId()));
                        break;
                } // end switch
            } // end for
        } // end if
        else {
            System.out.println("Sorry, no employee with title " + title + " was found.");
        } // end else
    } // end printRecord

    // display employee record by id
    public void printRecord(int id) {
        Employee employee = null;
        // check if the employee with this id exists
        if ((employee = getRecordById(id)) == null) {
            System.out.println("Sorry, no employee with ID " + id + " was found.");
        } // end if
        else {
            System.out.printf("%-18s %d %s Employee\n", employee.getName(), 
                                 employee.getOwnId(), employee.getTitle());
        } // end else
    } // end printRecord

    // Getters and Setters for records
    public ArrayList<Employee> getRecords() {
        return records;
    } // end getRecords

    public void setRecords(ArrayList<Employee> records) {
        this.records = records;
    } // end setRecords
} // end EmployeeRecords
