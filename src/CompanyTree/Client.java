package CompanyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nainadhanwani on 2/1/17.
 */
public class Client {

    public static void main(String[] args) {
        List <Company> companyList = new ArrayList <>();

        Company company1 = Company.createCompany(1, "AppDirect");

        Department department1 = Department.createDepartment(1, "HR");
        Department department2 = Department.createDepartment(2, "QA");
        company1.addDepartment(department1);
        company1.addDepartment(department2);

        Project project1 = Project.createProject(1, "Telsa");
        Project project2 = Project.createProject(2, "Voda");
        Project project3 = Project.createProject(3, "Sapient");
        department1.addProject(project1);
        department2.addProject(project2);
        department2.addProject(project3);


        Employee employee1 = Employee.createEmployee(1, "Naina", "200 Luker", "300 luker");
        Employee employee2 = Employee.createEmployee(2, "Nai", "100 Luker", "700 luker");
        Employee employee3 = Employee.createEmployee(3, "Naa", "500 Luker", "600 luker");

        project1.addEmployee(employee1);
        project2.addEmployee(employee2);
        project3.addEmployee(employee3);

        companyList.add(company1);

        Company company2 = Company.createCompany(2, "Accenture");

        Department department3 = Department.createDepartment(1, "HR");
        Department department4 = Department.createDepartment(2, "QA");
        company2.addDepartment(department3);
        company2.addDepartment(department4);

        Project project4 = Project.createProject(1, "Telsa");
        Project project5 = Project.createProject(2, "Voda");
        Project project6 = Project.createProject(3, "Sapient");
        department3.addProject(project1);
        department4.addProject(project2);
        department4.addProject(project3);


        Employee employee4 = Employee.createEmployee(1, "Naina", "200 Luker", "300 luker");
        Employee employee5 = Employee.createEmployee(2, "Nai", "100 Luker", "700 luker");
        Employee employee6 = Employee.createEmployee(3, "Naa", "500 Luker", "600 luker");
        project4.addEmployee(employee1);
        project5.addEmployee(employee2);
        project6.addEmployee(employee3);

        companyList.add(company2);

        for (Company company : companyList) {
            System.out.println("Company Details:"+company.getCompanyId() + "\t" + company.getCompanyName()+"\t");

            List <Department> departmentList = company.getDepartmentList();


            Iterator <Department> departmentIterator = departmentList.iterator();
            while (departmentIterator.hasNext()) {
                Department department = departmentIterator.next();
                System.out.println("Department details:"+department.getDepartmentId() + "\t" + department.getDepartmentName()+"\t");

                List <Project> projectList = department.getProjectList();

                for (int i = 0; i < projectList.size(); i++)                                    // Using for loop
                {
                    Project project = projectList.get(i);
                    System.out.println("Project Details:"+project.getProjectId() + "\t" + project.getProjectName()+"\t");

                    List <Employee> employeeList = project.getEmployeeList();

                    for (Employee employee :employeeList) {
                        System.out.println("Employee Details:"+employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getHomeAddress()
                        +"\t"+employee.getOfficeAddress());

                    }

                }


            }
        }
    }
}
