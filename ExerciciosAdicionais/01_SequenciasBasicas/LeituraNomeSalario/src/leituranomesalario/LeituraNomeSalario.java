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
        // Criação das variáveis
        String nome;
        float salario;
        // Criado objeto teclado para monitorar as entradas via teclado
        Scanner teclado = new Scanner(System.in);
        // Pede para o usuário informar o nome do funcionário e guarda na variável nome
        System.out.print("Nome do funcionário: ");
        nome = teclado.nextLine();
        // Pede par ao usuário informar o salário do funcionário e guarda na variável salario
        System.out.print("Salário: R$ ");
        salario = teclado.nextFloat();
        // Exibe na tela a mensagem com os valores da duas variáveis
        System.out.format("O funcionário %s tem um salário de R$ %.2f em Junho.\n", nome, salario);
    }
    
}
