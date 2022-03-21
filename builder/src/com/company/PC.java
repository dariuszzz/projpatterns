package com.company;

public class PC {
    public int ram = 0;
    public String gpu = "";
    public String cpu = "";

    public void printSpecs() {
        System.out.println("Ram: " + this.ram + ", GPU: " + this.gpu + ", CPU: " + this.cpu);
    }
}
