/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carteirademotorista;
import java.util.Scanner;

public class CarteiraDeMotorista {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você pode tirar a carteira.");
        } else {
            System.out.println("Você ainda não pode tirar a carteira.");
        }
        scanner.close();
    }
}

