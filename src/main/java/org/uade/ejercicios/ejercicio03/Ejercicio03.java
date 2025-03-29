package org.uade.ejercicios.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("ingrese otro número entero: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Los números SON iguales");
        }else if (num1>num2){
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        }else{
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        }
    }
}
