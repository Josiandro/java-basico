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
        
        String nome = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
    
}
