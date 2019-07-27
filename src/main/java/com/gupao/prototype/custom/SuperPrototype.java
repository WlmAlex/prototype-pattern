package com.gupao.prototype.custom;

import java.io.Serializable;
import java.util.Date;

public class SuperPrototype implements Serializable {

    protected int age;
    protected String name;
    protected Date birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
