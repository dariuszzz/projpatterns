package com.company;

public class Main {

    public static void main(String[] args) {
	    Singleton sing = Singleton.getInstance();
        Test test = new Test();

        sing.setNumber(2);

        System.out.println(test.getNumber2());

        test.setNumber2(5);


        System.out.println(sing.getNumber());
    }
}
