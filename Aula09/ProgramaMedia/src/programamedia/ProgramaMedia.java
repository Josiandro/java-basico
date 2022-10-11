/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

// Importação de biblioteca/pacote para monitorar a entrada de dados
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criação do objeto teclado do tipo Scanner para monitorar a entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        // Variável "n1" recebe o valor inteiro que foi pego usando o método nextFloat do objeto teclado
        float n1 = teclado.nextFloat();
        
        System.out.print("Segunda nota: ");
        // Variável "n2" recebe o valor inteiro que foi pego usando o método nextFloat do objeto teclado
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2;        
        System.out.println("Sua média foi " + m);
        
        //Teste condicional simples para felicitar o aluno
        if (m>9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
