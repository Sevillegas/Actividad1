/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto4;
import java.util.Scanner;

public class EjercicioResuelto4 {

   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Edad de Juan: ");
        int EDJUAN = input.nextInt();
        
        int EDALBER = (2 * EDJUAN) / 3;
        int EDANA = (4 * EDJUAN) / 3;
        int EDMAMA = EDJUAN + EDALBER + EDANA;

        System.out.println("La edad de Juan es: " + EDJUAN);
        System.out.println("La edad de Alberto es: " + EDALBER);
        System.out.println("La edad de Ana es: " + EDANA);
        System.out.println("La edad de la madre de Juan es: " + EDMAMA);
    }
}

