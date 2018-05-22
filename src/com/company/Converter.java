package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Converter {

    private static void converter(int liczba, int base, char[] dictionary){
        int rest;
        Stack<Character> stack = new Stack<>();
        while (liczba>0){
            rest=liczba%base;
            liczba/=base;
            stack.push(dictionary[rest]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int liczba = 0b1101_1011;

        System.out.println("Podaj podstawe (dziesiec/trzy/szesnascie)");
        String base = reader.nextLine();

        switch (base){
            case "dziesiec":
                System.out.println(liczba);
                break;
            case "trzy":
                char[] ternaryDictionary = {'0', '1', '2'};
                converter(liczba, 3, ternaryDictionary);
                break;
            case "szesnascie":
                char[] hexadecimalDictionary = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                converter(liczba, 16, hexadecimalDictionary);
                break;
            default: System.out.println("Nie ma takiej podstawy");
                break;

        }


    }
}
