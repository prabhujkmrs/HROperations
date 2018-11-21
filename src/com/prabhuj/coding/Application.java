package com.prabhuj.coding;

import com.prabhuj.coding.model.Department;
import com.prabhuj.coding.model.Employee;
import com.prabhuj.coding.model.service.EmployeeOperations;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to HR Operations Application");

        Department dep1 = new Department((long)10, "Complaince");
        Department dep2 = new Department((long)20, "Technology");
        Department dep3 = new Department((long)30, "Sales");
        Employee empl1 = new Employee((long) 1,"Alex",2000,dep1);
        Employee empl2 = new Employee((long) 2,"Sachin",3000,dep2);
        Employee empl3 = new Employee((long) 3,"Mark",4000,dep3);
        Employee empl4 = new Employee((long) 4,"Sonia",5000,dep3);

        EmployeeOperations eo = new EmployeeOperations();
        eo.save(empl1);
        eo.save(empl2);
        eo.save(empl3);
        eo.save(empl4);

        System.out.println(eo.department_Where_Total_Sal_Paid_Highest(employeeList));
        System.out.println(eo.department_With_Max_No_Of_Employees(employeeList));
        System.out.println(eo.total_Salary_Paid_Per_Department(employeeList));
    }
}
