/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile3;

import java.util.*;
public class Ejerciciowhile3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num1;
        int num2=random.nextInt(101);
        
        System.out.print("Número(Rango 0 a 100): ");
        num1 =sc.nextInt();
        
        while (num1 != num2){
        if (num1<num2){
        System.out.println("Mas alto ");    
        
        } 
        else if (num1>num2){
        System.out.println("Mas bajo");    
        }
        
        System.out.print("Número: ");
        num1 =sc.nextInt();
    }
        System.out.println("El número es: "+num1);
    }
}