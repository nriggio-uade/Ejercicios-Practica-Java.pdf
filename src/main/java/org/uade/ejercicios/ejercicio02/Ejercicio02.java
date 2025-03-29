package org.uade.ejercicios.ejercicio02;

import java.util.Scanner;

//2. Pedir dos números y decir si son iguales o no.
public class Ejercicio02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("ingrese otro número entero: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Los números SON iguales");
        }else{
            System.out.println("Los números NO SON iguales");
        }

    }
}
