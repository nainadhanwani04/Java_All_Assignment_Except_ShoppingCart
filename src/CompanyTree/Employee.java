package CompanyTree;

/**
 * Created by nainadhanwani on 2/1/17.
 */
public class Employee {
    private int employeeId;
    private String employeeName;
    private String homeAddress;
    private String officeAddress;

    public static Employee createEmployee(int employeeId, String employeeName, String homeAddress, String officeAddress) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        employee.setHomeAddress(homeAddress);
        employee.setOfficeAddress(officeAddress);
        return employee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

}
