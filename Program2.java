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

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) throws Exception {
        // to store employee data from text file
        EmployeeRecords records = new EmployeeRecords();
        // initialize the records from the text file
        FileIO.readFile("employeeData.txt", records);

        // to store the user input 
        String input;
        // determines when to stop the program
        Boolean exit = false;
        // sets the scanner to read from kb
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Lookup Program");
        // runs the program until the exit value is true
        while (!exit) {
            System.out.println("\nA) Find all employees with a given title");
            System.out.println("B) Find a single employee");
            System.out.println("X) Exit the program");
            System.out.println("\nEnter your choice:  ");
            input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "A":
                    System.out.println("\n1) Hourly Employee");
                    System.out.println("2) Salaried Employee");
                    System.out.println("3) Supervisory Employees");
                    System.out.println("\nEnter your choice:  ");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            records.printRecord("Hourly");
                            break;
                        case "2":
                            records.printRecord("Salaried");
                            break;
                        case "3":
                            records.printRecord("Supervisor");
                            break;
                        default:
                            System.out.println("Invalid choice! Please try again");
                            break;
                    } // end switch
                    break;
                case "B":
                    System.out.println("\nEnter the ID of the employee: ");
                    input = scanner.nextLine();
                    try {
                        records.printRecord(Integer.parseInt(input));
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                    } // end catch
                    break;
                case "X":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again");
                    break;
            } // end switch
        } // end while
        scanner.close();
    } // end main
} // end Program2

