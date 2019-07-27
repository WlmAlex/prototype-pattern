package com.gupao.prototype.custom;

import java.io.*;
import java.util.Date;

public class MyPrototype extends SuperPrototype implements Cloneable{

    private SubPrototype subPrototype;

    public MyPrototype() {
        this.subPrototype = new SubPrototype();
        this.age = 18;
        this.birthday = new Date();
        this.name = "alex";
    }

    @Override
    protected Object clone() {
        //serializable
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //deserializable
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            MyPrototype copy = (MyPrototype) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void change() {
        MyPrototype clone = (MyPrototype) clone();
        System.out.println("birthday of current object: " + this.getBirthday().getTime());
        System.out.println("birthday of clone object: " + clone.getBirthday().getTime());
        System.out.println("is clone object equals to current object? " + (this == clone));
        System.out.println("is clone object has the same sub prototype with current object?:" + (this.subPrototype == clone.subPrototype));
    }
}
