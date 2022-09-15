package com.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeeList;

    public Employees(){
        employeeList = new ArrayList<>();
    }

    public Employees(List<String> employeeList){
        this.employeeList = employeeList;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void loadEmployeeData(){
        this.employeeList.add("Raj");
        this.employeeList.add("Rohit");
        this.employeeList.add("Rom");
    }

    public Employees Clone() throws CloneNotSupportedException {
        List<String> empToClone = new ArrayList<>();

        for(String emp: employeeList){
            empToClone.add(emp);
        }

        return new Employees(empToClone);
    }
}
