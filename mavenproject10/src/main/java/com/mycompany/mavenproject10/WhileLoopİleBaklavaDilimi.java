/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject10;

/**
 *
 * @author muhammedYildiz
 */
public class mavenproject10{

    public static void main(String[] args) {
        
        
        int i=0;
        
        while(i<10)
        {
           
            
            int j=i;
            while(j<=10)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<i)
            {
                System.out.print("*");
                System.out.print(" ");
                k++;
            }
            i++;
            System.out.println();
            
        }
        i=10;
        while(i>1)
        {
            int j=i;
            while(j<=10)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<i)
            {
                System.out.print("*");
                System.out.print(" ");
                k++;
            }
            i--;
            System.out.println();
            
            
        }
        //Muhammed YILDIZ
    }
}
