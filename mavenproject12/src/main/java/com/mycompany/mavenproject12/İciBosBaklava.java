/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;

/**
 *
 * @author muhammedYildiz
 */
public class İciBosBaklava {

    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        int sayi = okuyucu.nextInt(); 
    
    
    for (int i=1; i<= sayi ; i++) 
    { 
        for (int j = sayi; j > i ; j--) 
        {
            System.out.print(" ");
        }
        System.out.print("*");
        
        for (int k = 1; k < 2*(i -1) ;k++)
        { 
            System.out.print(" "); 
        } 
        
        if( i==1) 
        { 
            System.out.println(""); 
        } 
        
        else 
        { 
            System.out.println("*");
        } 
    } 
        for (int i=sayi-1; i>= 1 ; i--)
            
        {
        for (int j = sayi; j > i ; j--) 
        {
            System.out.print(" ");
        }
        
        System.out.print("*");
        
        for (int k = 1; k < 2*(i -1) ;k++)
        {
            System.out.print(" ");
        }
        
        if( i==1)
        {
            System.out.println("");
        }
        else
        {
            System.out.println("*");
        }
    }
    }
}
