package com.designpattern.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employees emp = new Employees();
        emp.loadEmployeeData();

        System.out.println(emp.getEmployeeList());

        Employees empNew = emp.Clone();

        System.out.println(empNew.getEmployeeList());

        emp.getEmployeeList().remove("Raj");

        System.out.println(emp.getEmployeeList());
        System.out.println(empNew.getEmployeeList());

    }
}
