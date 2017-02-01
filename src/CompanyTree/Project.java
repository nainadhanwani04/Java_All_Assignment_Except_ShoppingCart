package CompanyTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nainadhanwani on 2/1/17.
 */
public class Project {

    private int projectId;
    private String projectName;
    private List <Employee> employeeList = new ArrayList <>();

    public static Project createProject(int projectId, String projectName) {
        Project project = new Project();
        project.setProjectId(projectId);
        project.setProjectName(projectName);
        return project;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List <Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List <Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
