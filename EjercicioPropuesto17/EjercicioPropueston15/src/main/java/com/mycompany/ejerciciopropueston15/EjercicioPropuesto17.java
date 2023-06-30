/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropueston15;
import java.util.Scanner;

public class EjercicioPropuesto17 {

      
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Ingrese el radio del circulo: ");
      double radio = input.nextDouble();
      
      double area = Math.PI * Math.pow(radio, 2);
      double longitud = 2 * Math.PI * radio;
      
      System.out.println("El area del circulo es: " + area);
      System.out.println("La longitud de la circunferencia es: " + longitud);
   }
}

