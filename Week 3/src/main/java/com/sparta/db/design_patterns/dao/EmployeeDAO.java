package com.sparta.db.design_patterns.dao;

import com.sparta.db.design_patterns.dto.Employee;
import com.sparta.db.design_patterns.dto.EmployeeRecord;

import java.time.LocalDate;
import java.util.ArrayList;


public class EmployeeDAO { // Data Access Object
    //Holds data in the same class
    static ArrayList<EmployeeRecord> employees = new ArrayList<>();

    static {
        // employees will be generated in here.
        employees.add(new EmployeeRecord("Dan", 21000, LocalDate.of(2001, 8, 3)));
        employees.add(new EmployeeRecord("Alex", 13000, LocalDate.of(1996, 3, 8)));
        employees.add(new EmployeeRecord("Taylor", 21000, LocalDate.of(2001, 3, 8)));
        employees.add(new EmployeeRecord("Greg", 28000, LocalDate.of(2001, 3, 8)));
        employees.add(new EmployeeRecord("Diana", 24000, LocalDate.of(2000, 8, 27)));
    }

    public static void printEmployees(){
        for(EmployeeRecord employee: employees){
            System.out.println(employee);
        }
    }

    public static void deleteEmployee(EmployeeRecord employee){
        employees.remove(employee);
    }

    public static void updateEmployeeName(EmployeeRecord employeeRecord, String name){
        int salary = employeeRecord.salary();
        LocalDate dob = employeeRecord.dob();
        deleteEmployee(employeeRecord);

        addEmployee(name, salary, dob);
    }

    public static void addEmployee(String name, int salary, LocalDate dob){
        employees.add(new EmployeeRecord(name, salary, dob));
    }

    // Takes the data from somewhere else
//    private ArrayList<EmployeeRecord> employees;
//
//    public EmployeeDAO(ArrayList<EmployeeRecord> employees) {
//        this.employees = employees;
//    }

    // Create
    // Read
    // Update
    // Delete
    // ^ This is the minimum
    // v This is extra
    // This should be used for data comparison
}
