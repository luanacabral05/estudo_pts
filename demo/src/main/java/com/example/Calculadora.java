package com.example;

public class Calculadora {

    public int soma(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public double div(int a, int b){
        if (b==0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a/b;   
    }
}