package com.company;

public class Main {

    public static void main(String[] args) {
        PCBuilder builder = new PCBuilder();

        builder.setRam(16);
        builder.setCPU("intel");
        builder.setGPU("amd");

        PC pc = builder.getPC();
        pc.printSpecs();
    }
}
