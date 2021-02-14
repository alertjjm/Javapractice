package com.company;

public class Member implements Comparable<Member>{
    public static final int MALE=0;
    public static final int FEMALE=1;
    private String name;
    private int age;
    private int sex;

    public Member(String name, int sex,int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    @Override
    public int compareTo(Member o) {
        return Integer.compare(age,o.getAge());
    }
}
