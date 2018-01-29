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
    private double annualBonus;
    
    public Supervisor() {
        super();
        annualBonus = 0;
    } // end Supervisor
    
    public Supervisor(String name, String address, int ownId, int bossId, double pay, double bonus) {
        super(name, address, ownId, bossId, pay);
        annualBonus = bonus;
    } // end Supervisor

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    @Override
    public double getGrossWeeklyPay() {
        return super.getGrossWeeklyPay() + annualBonus / 52;
    }
}
