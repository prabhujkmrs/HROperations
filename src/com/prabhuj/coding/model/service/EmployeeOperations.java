package com.prabhuj.coding.model.service;

import com.prabhuj.coding.Application;
import com.prabhuj.coding.model.Employee;

import java.util.*;

public class EmployeeOperations {

    public void save(Employee employee){
        Application.employeeList.add(employee);
    }

    public Map<String,Integer> total_Salary_Paid_Per_Department(List<Employee> employeeList){
        Map<String,Integer> result = new HashMap<>();
        //java 8 foreach
        employeeList.forEach(emp -> {
            if(! result.containsKey(emp.getDepartment().getDepartmentName())) {
                result.put(emp.getDepartment().getDepartmentName(), emp.getSalary());
            }
            else {
                int total_salary = result.get(emp.getDepartment().getDepartmentName())+emp.getSalary();
                result.replace(emp.getDepartment().getDepartmentName(), total_salary );
            }
        });
        return result;
    }


    public String department_With_Max_No_Of_Employees(List<Employee> employeeList){
        Map<String,Integer> result = new HashMap<>();
        // normal for each loop
        for (Employee emp: employeeList) {

            if(! result.containsKey(emp.getDepartment().getDepartmentName())) {
                result.put(emp.getDepartment().getDepartmentName(), 1);
            }
            else {
                int count = result.get(emp.getDepartment().getDepartmentName())+1;
                result.replace(emp.getDepartment().getDepartmentName(), count );
            }

        }
        // Java8 find the max value in map and return its key
        return Collections.max(result.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

    }

    public Map.Entry<String, Integer> department_Where_Total_Sal_Paid_Highest(List<Employee> employeeList){

        Map<String,Integer> result = new HashMap<>();

        for (Employee emp: employeeList)
        {
            if(! result.containsKey(emp.getDepartment().getDepartmentName())) {
                result.put(emp.getDepartment().getDepartmentName(), emp.getSalary());
            }
            else {
                int total_salary = result.get(emp.getDepartment().getDepartmentName())+emp.getSalary();
                result.replace(emp.getDepartment().getDepartmentName(), total_salary );
            }
        }

        //java 7 finding max value in collection
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : result.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry;

    }
}
