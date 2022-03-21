package com.company;

public class Test {
    private Singleton sing = Singleton.getInstance();

    public void setNumber2(int num) {
        this.sing.setNumber(num);
    }

    public int getNumber2() {
        return this.sing.getNumber();
    }
}
