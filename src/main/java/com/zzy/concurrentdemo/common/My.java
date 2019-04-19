package com.zzy.concurrentdemo.common;

public class My {
    private int x;

    public My(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "My{" +
            "x=" + x +
            '}';
    }
}