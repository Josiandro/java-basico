/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

// Importação de biblioteca/pacote para monitorar a entrada de dados
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação do objeto t do tipo Scanner para monitorar a entrada de dados
        Scanner t = new Scanner(System.in);
        
        System.out.print("Em que ano você nasceu? ");
        // Variável "nasc" recebe o valor inteiro que foi pego usando o método nextInt do objeto t
        int nasc = t.nextInt();
        
        int i = 2022-nasc;
        
        System.out.println("Sua idade é " + i);
        
        // Teste condicionar para ver se i é maior ou igual a 18
        if (i>=18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
    
}
