/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author muhammedYildiz
 */
public class SayilarlaBaklavaDilimi {

    public static void main(String[] args) {
        
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("Giriniz :  ");
        int sayi = okuyucu.nextInt();
            for (int i = 1; i <= sayi; i++)
            {
            for (int j = sayi; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            }

            for (int i = 1; i <= sayi; i++)
            {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= sayi - i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        
        }
        //Muhammed Yıldız
 
        
        
    }
}
