package com.test;

import java.util.Arrays;

public class Dog {
    /* 강아지 속성 : 이름(String), 재주(String[]) */
    private String name;
    private String[] skill;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String[] skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }
    public void learnAbility(String[] teachingAbility) {
        this.skill = teachingAbility;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", skill=" + Arrays.toString(skill) +
                '}';
    }
}
