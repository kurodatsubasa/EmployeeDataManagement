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
import java.io.FileReader;

public class FileIO {

    static void readFile(String fileName, EmployeeRecords records) throws Exception {
        BufferedReader input = new BufferedReader(new FileReader("employeeData.txt"));
        String info = null;
        
        while((info = input.readLine()) != null) {
            String[] parts = info.split(";");
            switch(parts[0]) {
                case "Hourly":
                    records.getRecords().add(new HrEmployee(parts[0], parts[1], 
                            parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), 
                            Double.parseDouble(parts[5]), Double.parseDouble(parts[6])));
                    break;
                case "Salaried":
                    records.getRecords().add(new SalEmployee(parts[0], parts[1], 
                            parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), 
                            Double.parseDouble(parts[5])));
                    break;
                case "Supervisor":
                    records.getRecords().add(new Supervisor(parts[0], parts[1], 
                            parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), 
                            Double.parseDouble(parts[5]), Double.parseDouble(parts[6])));
                    break;
            } // end switch
            
        } // end While
        input.close();
    }
    
}
