package com.company;


public class WrongNumberException extends Exception{
    public WrongNumberException(){
        System.out.println("Podaj trzycyfrową liczbę całkowitą");
    }
}