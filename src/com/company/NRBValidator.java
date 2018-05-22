package com.company;

import java.util.Scanner;
import java.math.BigInteger;

public class NRBValidator {

    private static Boolean Validate(String accountNumber){
        BigInteger accountNumberInt;
        
        accountNumber += "2521";
        accountNumber = accountNumber.substring(2,30) + accountNumber.substring(0,2);
        accountNumberInt = new BigInteger(accountNumber);
        
        if (accountNumberInt.mod(new BigInteger("97")).equals(new BigInteger("1"))){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj numer rachunku bankowego NRB");
        String accountNumber = reader.nextLine();
        
        if (Validate(accountNumber)){
            System.out.println("Numer prawidłowy");
        }
        else
        {System.out.println("Numer nieprawidłowy");}

    }
}
