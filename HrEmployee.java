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

public class HrEmployee extends Employee {

    private double payHrRate;
    private double workHrs;
    
    public HrEmployee() {
        super();
        payHrRate = 0;
        workHrs = 0;
    } // end HourlyEmployee
    
    public HrEmployee(String name, String address, int ownId, int bossId, double rate, double hrs) {
        super(name, address, ownId, bossId);
        payHrRate = rate;
        workHrs = hrs;
    } // end HrEmployee

    public double getPayHrRate() {
        return payHrRate;
    }

    public void setPayHrRate(double payHrRate) {
        this.payHrRate = payHrRate;
    }

    public double getWorkHrs() {
        return workHrs;
    }

    public void setWorkHrs(double workHrs) {
        this.workHrs = workHrs;
    }

    @Override
    public double getGrossWeeklyPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
