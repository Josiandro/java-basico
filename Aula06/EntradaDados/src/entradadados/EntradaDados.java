/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadados;

// Importação da biblioteca/pacote java.util.Scanner (usada para monitorar a entrada de dados)
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class EntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação do objeto teclado da classe Scanner (vai monitorar o System.in)
        Scanner teclado = new Scanner(System.in);
        // Imprime a pergunta para o usuário (System.out)
        System.out.print("Digite o nome do aluno: ");
        // Variável nome recebe o valor digitado através do método nextLine (para String)
        String nome = teclado.nextLine();
        // Imprime a pergunta para o usuário (System.out)
        System.out.print("Digite a nota do aluno: ");
        // Variável not recebe o valor digitado através do método nextFloar (para Float)
        float nota = teclado.nextFloat();
        // Escreve na tela a mensagem com nome e nota do aluno
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
}

/*
 * System.out.format
 * Format possibilita a formação da saída
 * %s vai ser substituído pela variável String
 * %f vai ser substituído pela variável Float (%.1f indica uma casa decimal)
 * no final, são informadas as variáveis com as informações
 */