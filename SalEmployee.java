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

// Salaried Employee
public class SalEmployee extends Employee {

    // to store annual salary
    private double aPay;
    // to store number of weeks in year
    protected static final int NUM_WEEKS = 52;  
    
    // default constructor
    public SalEmployee() {
        super();
        aPay = 0;
    } // end SalEmployee
    
    // overloaded constructor
    public SalEmployee(String title, String name, String address, int ownId, int bossId, double pay) {
        super(title, name, address, ownId, bossId);
        aPay = pay;        
    } // end SalEmployee

    // Getters and Setters for annual salary
    public double getAPay() {
        return aPay;
    } // end getAPay

    public void setAPay(double aPay) {
        this.aPay = aPay;
    } // end setAPay

    // overriding abstract method to calculate pay for salaried employee, 
    @Override
    public double getGrossWeeklyPay() {
        // annual pay / 52
        return aPay / NUM_WEEKS;
    } // end getGrossWeeklyPay
} // end SalEmployee
