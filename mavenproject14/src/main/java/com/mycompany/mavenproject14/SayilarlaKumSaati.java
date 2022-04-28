/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject14;

import java.util.Scanner;

/**
 *
 * @author mildi
 */
public class SayilarlaKumSaati {

    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Girin : ");
        int sayi = okuyucu.nextInt();

        for (int i = 1; i <= sayi; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= sayi; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = sayi; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= sayi; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
