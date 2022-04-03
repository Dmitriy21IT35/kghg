package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner myscan = new Scanner (System.in);
        String word = myscan.next ();
        System.out.println("Введите подстроку");
        Scanner myscan1 = new Scanner (System.in);
        String wordp = myscan1.next ();
        boolean b1 = word.endsWith(wordp);
        if (b1 ==true){
            System.out.println("true");
        }
        else {System.out.println("false");}


    }
}
