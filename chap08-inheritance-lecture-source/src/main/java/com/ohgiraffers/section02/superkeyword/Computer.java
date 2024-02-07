package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출함");
    }

    public Computer(String cpu, int hadd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hadd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스 모든 필드를 초기화하는 생성자 호출함");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hadd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;                                                 //(석현) super랑 this는 동시에 쓸 수 없다.
        this.hdd = hadd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함");
    }

    // (석현) setter와 getter는 부모꺼 까지 자식이 본인꺼 처럼 사용할 수 있어서 굳이 부모꺼 까지 치지 않음

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHadd() {
        return hdd;
    }

    public void setHadd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        return super.getInformation()                  // (석현) this.을 쓰게되면 부모의 메소드를 부르는게 아니라 본인의 메소드를 부르게 돼서 StackOverflow 오류가 생김
                +"Computer ["
                +"cpu = " + this.cpu
                +", hdd = " + this.hdd
                +", ram = " + this.ram
                +", operationSystem = " + this.operationSystem
                +"]";


    }























}
