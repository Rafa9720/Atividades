/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.custoviagem;

import java.util.Scanner;

public class CustoViagem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite a distância até a fazenda:");
        double distancia = scanner.nextDouble();

       
        System.out.print("Digite o preço do litro da gasolina:");
        double precoLitro = scanner.nextDouble();

      
        double gasolinaNecessaria = distancia / 12;

       
        double custoTotal = gasolinaNecessaria * precoLitro;

     
        System.out.printf("Você precisará de %.2f litros de gasolina.\n", gasolinaNecessaria);
        System.out.printf("O custo total da viagem será de R$ %.2f.\n", custoTotal);

      
        scanner.close();
    }
}
