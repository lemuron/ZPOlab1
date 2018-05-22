package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class Dictionary {

    public static int readNumber() throws WrongNumberException{
        Scanner reader = new Scanner(System.in);
        int number = 0;
        number = reader.nextInt();
        if (number>999 || number<100){
            throw new WrongNumberException();
        }
        else
            return number;
    }

    public static void main(String[] args){


        Map<Integer, String> numbers =  new HashMap<>();

        numbers.put(100, "sto");
        numbers.put(200, "dwieście");
        numbers.put(300, "trzysta");
        numbers.put(400, "czterysta");
        numbers.put(500, "pięćset");
        numbers.put(600, "sześćset");
        numbers.put(700, "siedemset");
        numbers.put(800, "osiemset");
        numbers.put(900, "dziewięćset");
        numbers.put(0, "");
        numbers.put(1, "jeden");
        numbers.put(2, "dwa");
        numbers.put(3, "trzy");
        numbers.put(4, "cztery");
        numbers.put(5, "pięć");
        numbers.put(6, "sześć");
        numbers.put(7, "siedem");
        numbers.put(8, "osiem");
        numbers.put(9, "dziewięć");
        numbers.put(10, "dziesięć");
        numbers.put(11, "jedenaście");
        numbers.put(12, "dwanaście");
        numbers.put(13, "trzynaście");
        numbers.put(14, "czternaście");
        numbers.put(15, "piętnaście");
        numbers.put(16, "szesnaście");
        numbers.put(17, "siedemnaście");
        numbers.put(18, "osiemnaście");
        numbers.put(19, "dziewiętnaście");
        numbers.put(20, "dwadzieścia");
        numbers.put(30, "trzydzieści");
        numbers.put(40, "czterdzieści");
        numbers.put(50, "pięćdziesiąt");
        numbers.put(60, "sześćdziesiąt");
        numbers.put(70, "siedemdziesiać");
        numbers.put(80, "osiemdziesiąt");
        numbers.put(90, "dziewięćdziesiąt");
        int number = 0;

        while(true){
            try{
                number = readNumber();
            }
            catch (WrongNumberException e){
            }

            if (number%100>19 || number%100<11){
                System.out.println(numbers.get(number-number%100)+" "+numbers.get(number-(number-number%100)-number%10)+" "+numbers.get(number-(number-number%100)-(number-(number-number%100)-number%10)));
            }
            else{
                System.out.println(numbers.get(number-number%100)+" "+numbers.get(number-(number-number%100)));
            }

        }


    }

}
