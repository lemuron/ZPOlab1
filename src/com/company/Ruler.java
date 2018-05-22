package com.company;

import java.util.Scanner;

public class Ruler {

    private static void line(int length, int space, int levels){
        System.out.println("");
        for (int i = 0;i < length + 1 ; i++) {
            System.out.print("|");
            for (int j = 0; j < space + 1 ; j++)
                System.out.print(" ");

        }
        if(levels > 1){
            line(length * 2 , (space -2)/ 2 , levels - 1);
        }
        }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int length;
        int levels;
        int space;

        System.out.println("Input length:");
        length = scanner.nextInt();

        System.out.println("Input number of levels of nesting:");
        levels = scanner.nextInt();

        space = levels * 2;
        for (int i = 0;i < length + 1; i++){
            System.out.print(i);
            for(int j = 0;j <  space + 1;j++)
                System.out.print(" ");
        }

        line(length, space, levels );
    }

}