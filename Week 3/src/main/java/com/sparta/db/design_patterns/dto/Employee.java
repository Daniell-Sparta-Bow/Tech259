package com.sparta.db.design_patterns.dto;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final Integer salary;
    private final LocalDate dob;

    public Employee(String name, Integer salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }
}
