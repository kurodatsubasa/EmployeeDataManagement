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
    private int ownId;
    private int bossId;

    public Employee() {
        name = "";
        address = "";
        ownId = 0;
        bossId = 0;
    }
    
        public Employee(String name, String address, int ownId, int bossId) {
        this.name = name;
        this.address = address;
        this.ownId = ownId;
        this.bossId = bossId;
    }

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

    public int getOwnId() {
        return ownId;
    }

    public void setOwnId(int ownId) {
        this.ownId = ownId;
    }

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public abstract double getGrossWeeklyPay();
}
