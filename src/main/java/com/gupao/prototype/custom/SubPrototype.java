package com.gupao.prototype.custom;

import java.io.Serializable;

public class SubPrototype implements Serializable {

    private int height;
    private int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}