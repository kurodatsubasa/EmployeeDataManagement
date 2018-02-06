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

// Hourly Employee
public class HrEmployee extends Employee {

    // to store hourly pay rate and a number of working weekly hours
    private double payHrRate;
    private double workHrs;

    // default constructor
    public HrEmployee() {
        super();
        payHrRate = 0;
        workHrs = 0;
    } // end HourlyEmployee

    // overloaded constructor
    public HrEmployee(String title, String name, String address, int ownId, 
            int bossId, double rate, double hrs) {
        super(title, name, address, ownId, bossId);
        payHrRate = rate;
        workHrs = hrs;
    } // end HrEmployee

    // Getters and Setters for payHrRate
    public double getPayHrRate() {
        return payHrRate;
    } // end PayHrRate

    public void setPayHrRate(double payHrRate) {
        this.payHrRate = payHrRate;
    } // end payHrRate

    // Getters and Setters for workHrs
    public double getWorkHrs() {
        return workHrs;
    } // end getWorkHrs

    public void setWorkHrs(double workHrs) {
        this.workHrs = workHrs;
    } // end setWorkHrs

    // overriding abstract method to calculate pay for hourly employee, 
    @Override
    public double getGrossWeeklyPay() {
        // Hourly pay rate * hours worked
        return payHrRate * workHrs;
    } // end getGrossWeeklyPay
} // end HrEmployee
