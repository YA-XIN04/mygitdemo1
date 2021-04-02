package com.myit.pojo;

public class Dept {
    private int dept_id;
    private String dept_name;
    private String dept_address;

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_address='" + dept_address + '\'' +
                '}';
    }

    public Dept() {
    }

    public Dept(int dept_id, String dept_name, String dept_address) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.dept_address = dept_address;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public void setDept_address(String dept_address) {
        this.dept_address = dept_address;
    }

    public int getDept_id() {
        return dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public String getDept_address() {
        return dept_address;
    }
}
