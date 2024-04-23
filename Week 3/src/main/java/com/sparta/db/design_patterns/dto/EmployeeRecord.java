package com.sparta.db.design_patterns.dto;

import java.time.LocalDate;

public record EmployeeRecord(String name, Integer salary, LocalDate dob) {

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }
}
