package manytoonee3.controller;

import java.util.ArrayList;
import java.util.List;

import manytoonee3.dao.CompanyDao;
import manytoonee3.dao.EmployeeDao;
import manytoonee3.dto.Company;
import manytoonee3.dto.Employee;

public class EmpCmpController {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(200);
	company.setName("Infosys");
	company.setGst("inf@123");
	
	
	
	Employee employee1=new Employee();
	employee1.setId(4);
	employee1.setName("Hima");
	employee1.setAddress("bangalore");
	
	employee1.setCompany(company);
	
	Employee employee2=new Employee();
	employee2.setId(5);
    employee2.setName("Rupa");
    employee2.setAddress("Pune");
    employee2.setCompany(company);
    
    Employee employee3=new Employee();
    employee3.setId(6);
    employee3.setName("Aditi");
    employee3.setAddress("delhi");
    
    employee3.setCompany(company);
    
    CompanyDao companyDao=new CompanyDao();
    EmployeeDao employeeDao=new EmployeeDao();
    
    companyDao.saveCompany(company);

    
    List<Employee> employees=new ArrayList<Employee>();
    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    
    employeeDao.saveEmployee(employees);
}
}
