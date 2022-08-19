package com.example;

public class FunctionalPurityDemo {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int notPure(){
        return number;
    }
}
