/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();
        
        double media = (nota1 + nota2 + notaTrabalho) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
       
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
