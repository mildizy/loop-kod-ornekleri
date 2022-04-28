/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject13;

import java.util.Scanner;

/**
 *
 * @author muhammedYildiz
 */
public class SagaYatıkUcgen {

    public static void main(String[] args) {
         Scanner okuyucu=new Scanner(System.in);
        System.out.print("Giriniz :  ");
        int sayi = okuyucu.nextInt();
            for (int i = 0; i <= sayi; i++)
            {
                System.out.print(" ");    
                for (int j = sayi; j > i; j--)
                {
                System.out.print(" ");
                }

                for (int j = 1; j <= i; j++)
                {
                System.out.print("*");
                }
                System.out.println();
            }   
            
            //Muhammed YILDIZ-2002131035
    }
}
