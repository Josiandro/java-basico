/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leituranomesalario;

import java.util.Scanner;

/**
 *
 * @author josia
 */
public class LeituraNomeSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        float salario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome do funcionário: ");
        nome = teclado.nextLine();
        
        System.out.print("Salário: R$ ");
        salario = teclado.nextFloat();
        
        System.out.format("O funcionário %s tem um salário de R$ %.2f em Junho.\n", nome, salario);
    }
    
}
