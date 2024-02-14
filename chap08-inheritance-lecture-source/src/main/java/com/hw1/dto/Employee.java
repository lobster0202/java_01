package com.hw1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void  setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String information(){
        return super.information()
                +" 급여 = " + this.salary
                +" 부서 = " + this.dept;
    }




}
