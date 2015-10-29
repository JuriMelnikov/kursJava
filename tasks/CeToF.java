/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CeToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tc, tf;
        tf = scanner.nextFloat();
        tc=(tf-32)*5/9;
        System.out.printf("%.2f \u00B0 -> %.2f F %n", tc,tf);
    }
   
}
