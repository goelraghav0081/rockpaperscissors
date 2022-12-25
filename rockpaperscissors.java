package com.company;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Raghav
 * @version 0.1
 * @since 2022
 */

class rockpaperscissors {
    public static  void main(String[] args) {
        Random ran = new Random();
        int pc = ran.nextInt(3);
        System.out.println("let's play rock paper scissors\n\nif u want to choose\nfor rock enter 0\nfor paper enter 1\nfor scissors enter 2");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        System.out.println(pc);
        if (user == 0) {
            if (pc == 0) {
                System.out.println("tie");
            } else if (pc == 1) {
                System.out.println("computer is winner");
            } else if (pc == 2) {
                System.out.println("you are winner");
            }
        }
        if (user == 1) {
            if (pc == 0) {
                System.out.println("you are winner");
            } else if (pc == 1) {
                System.out.println("tie");
            } else if (pc == 2) {
                System.out.println("computer is winner");
            }
        }
        if (user == 2) {
            if (pc == 0) {
                System.out.println("computer is winner");
            } else if (pc == 1) {
                System.out.println("you are winner");
            } else if (pc == 2) {
                System.out.println("tie");
            }
        }
    }
}
