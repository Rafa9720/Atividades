/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaobesidade;
import java.util.Scanner;

public class VerificaObesidade {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso:");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

     
        if (imc > 30) {
       
            System.out.println("Você está obeso.");
        } else {
      
            System.out.println("Você não está obeso.");
        }

        scanner.close();
    }
}
