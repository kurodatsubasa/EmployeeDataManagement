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

public class SalEmployee extends Employee {

    private double annualPay;
    
    public SalEmployee() {
        super();
        annualPay = 0;
    } // PayEmployee
    
    public SalEmployee(String name, String address, int ownId, int bossId, double pay) {
        super(name, address, ownId, bossId);
        annualPay = pay;        
    } // PayEmployee

    public double getAnnualPay() {
        return annualPay;
    }

    public void setAnnualPay(double annualPay) {
        this.annualPay = annualPay;
    }

    @Override
    public double getGrossWeeklyPay() {
        return annualPay / 52;
    }
}
