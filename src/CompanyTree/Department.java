package CompanyTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nainadhanwani on 2/1/17.
 */
public class Department {
    private int departmentId;
    private String departmentName;
    private List <Project> projectList = new ArrayList <>();

    public static Department createDepartment(int departmentId, String departmentName) {
        Department department = new Department();
        department.setDepartmentId(departmentId);
        department.setDepartmentName(departmentName);
        return department;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List <Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List <Project> projectList) {
        this.projectList = projectList;
    }

    public void addProject(Project project) {
        projectList.add(project);
    }
}
