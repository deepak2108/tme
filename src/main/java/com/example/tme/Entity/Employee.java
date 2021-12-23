package com.example.tme.Entity;

import javax.persistence.Id;

public class Employee {
    @Id
    int empid;

    String empname;
    String empaddess;
    String empsalary;

    public Employee() {
        super();
    }

    public Employee(int empid, String empname, String empaddess, String empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empaddess = empaddess;
        this.empsalary = empsalary;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpaddess(String empaddess) {
        this.empaddess = empaddess;
    }

    public void setEmpsalary(String empsalary) {
        this.empsalary = empsalary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public String getEmpaddess() {
        return empaddess;
    }

    public String getEmpsalary() {
        return empsalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empaddess='" + empaddess + '\'' +
                ", empsalary='" + empsalary + '\'' +
                '}';
    }
}
