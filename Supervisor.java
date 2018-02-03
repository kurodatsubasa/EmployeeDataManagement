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

public class Supervisor extends SalEmployee {
    // to store annual bonus
    private double aBonus;
    
    // default constructor
    public Supervisor() {
        super();
        aBonus = 0;
    } // end Supervisor
    
    // overloaded constructor
    public Supervisor(String title, String name, String address, int ownId, int bossId, double pay, double bonus) {
        super(title, name, address, ownId, bossId, pay);
        aBonus = bonus;
    } // end Supervisor

    // Getters and Setters for annual bonus
    public double getABonus() {
        return aBonus;
    } // end getABonus

    public void setABonus(double aBonus) {
        this.aBonus = aBonus;
    } // end setABonus
    
    public void getEmployeeId() {
        
    }
    
     // overriding abstract method to calculate pay for supervisor, 
    @Override
    public double getGrossWeeklyPay() {
        // annual salary / 52 + bonus / 52
        return super.getGrossWeeklyPay() + aBonus / SalEmployee.NUM_WEEKS;
    } // end getGrossWeeklyPay
} // end Supervisor
