package CompanyTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nainadhanwani on 2/1/17.
 */
public class Company {
    private int companyId;
    private String companyName;
    private List <Department> departmentList = new ArrayList <>();

    public static Company createCompany(int companyId, String companyName) {
        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyName(companyName);
        return company;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List <Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List <Department> departmentList) {
        this.departmentList = departmentList;
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }
}
