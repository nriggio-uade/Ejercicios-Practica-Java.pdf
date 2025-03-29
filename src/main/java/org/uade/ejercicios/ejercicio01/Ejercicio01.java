package org.uade.ejercicios.ejercicio01;
import java.util.Scanner;

//1. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
public class Ejercicio01 {
    public static void main(String[] args) {

        //Creo un scanner para pedir el radio
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        System.out.println("El área del círculo es: " + calcularArea(radio));
        sc.close();

    }

    public static double calcularArea(double radio){
        double result= Math.PI * Math.pow(radio, 2);
        return result;

    }
}
