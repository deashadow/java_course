package chapter9;
/*
*This is about inheritance---- the Employee class will inherit from the
* Person class---  use the keyword 'extends'
 */
public class Employee extends Person { //SERVING as SUBCLASS

    private String employeeId;//then right click to generate getters/setters
    private String title;

    public Employee(){ //this is built in--do not have to create
        super("Renee"); //can make a call to SUPER CLASS--Person in constructor param
        //this will call second constructor--SUPER must be first statement
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
