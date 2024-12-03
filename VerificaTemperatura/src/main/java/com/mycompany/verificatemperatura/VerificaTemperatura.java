/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificatemperatura;
import java.util.Scanner;

public class VerificaTemperatura {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura:");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37) {
          
            System.out.println("Você está com febre.");
        } else {
        
            System.out.println("Sua temperatura está normal.");
        }

        scanner.close();
    }
}

