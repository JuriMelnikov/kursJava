/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class DataTypes {
    public static void main(String[] args) {
        int number=0, total=1;
        double percentOfDiscount;
        float numFloat=10f;
        final int MAX_COUNT=10;
        System.out.println("Number = "+(number+total)+'\n'+numFloat);
        //System.out.printf("Float: %1$f Nubmer = %0$d%n Float: %1$-10.2f%n",(number+total),numFloat);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        numFloat=scanner.nextFloat();
        System.out.printf("Your number is %d and %.2f\n",number,numFloat);
        
    }}
