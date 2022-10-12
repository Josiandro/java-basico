/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

// Importa pacote/biblioteca para entrada de dados
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp = "";
        // Criação do objeto teclado
        Scanner teclado = new Scanner(System.in);
        // Inicia laço de repetição com teste no final
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s = s+= n; //s = s + n;
            
            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S") || resp.equals("s")); // Repete enquanto a resposta for S ou s.
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
