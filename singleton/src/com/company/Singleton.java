package com.company;

public class Singleton {
    static private Singleton instance;
    public int number = 0;

    private Singleton() {}

    static Singleton getInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }

        return Singleton.instance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int num) {
        this.number = num;
    }

}
