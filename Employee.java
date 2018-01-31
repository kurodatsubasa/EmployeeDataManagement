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

/* Because every employee in the company must be working and receiving some kind
 * of salary/pay, Employee is an abstract class that only serves as a base class for 
 * hourly, salaried and supervisor employee classes
 */
public abstract class Employee {

    // stores basic attributes of Employee
    private String title;
    private String name;
    private String address;
    private int ownId;
    private int bossId;

    // default constructor
    public Employee() {
        name = "";
        address = "";
        ownId = 0;
        bossId = 0;
    } // end Employee

    // overloaded constructor
    public Employee(String name, String address, int ownId, int bossId) {
        this.name = name;
        this.address = address;
        this.ownId = ownId;
        this.bossId = bossId;
    } // end Employee

    // Getters and Setters for name
    public String getName() {
        return name;
    } // end getName

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters for address
    public String getAddress() {
        return address;
    } // end getAddress

    public void setAddress(String address) {
        this.address = address;
    } // end setAddress

    // Getters and Setters for employee id
    public int getOwnId() {
        return ownId;
    } // end getOwnId

    public void setOwnId(int ownId) {
        this.ownId = ownId;
    } // setOwnId

    // Getters and Setters for employee's boss id
    public int getBossId() {
        return bossId;
    } // end getBossId

    public void setBossId(int bossId) {
        this.bossId = bossId;
    } // end setBossId

    // Getters and Setters for employee's title
    public String getTitle() {
        return title;
    } // end getTitle

    public void setTitle(String title) {
        this.title = title;
    } // end setTitle

    // abstract method for gross weekly play
    public abstract double getGrossWeeklyPay();
} // end Employee
