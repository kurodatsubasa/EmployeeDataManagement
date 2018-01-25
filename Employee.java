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

public abstract class Employee {
    private String name;
    private String address;
    private int ownID;
    private int bossID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOwnID() {
        return ownID;
    }

    public void setOwnID(int ownID) {
        this.ownID = ownID;
    }

    public int getBossID() {
        return bossID;
    }

    public void setBossID(int bossID) {
        this.bossID = bossID;
    }
    
    public abstract double getGrossWeeklyPay();
}
