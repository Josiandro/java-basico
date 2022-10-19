/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leituranome;

import java.util.Scanner;

/**
 *
 * @author josia
 */
public class LeituraNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criada variável nome como String
        String nome = "";
        // Criado objeto teclado para monitor as entradas do teclado
        Scanner teclado = new Scanner(System.in);
        // Solicita ao usuario que informe o nome e salva na variável nome
        System.out.print("Qual é o seu nome: ");
        nome = teclado.nextLine();
        // Exibe na tela a mensagem de boas vindas concatenando o nome
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
    
}
