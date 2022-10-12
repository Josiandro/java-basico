/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

// Importação do pacote/biblioteca para trabalhar com vetores
import java.util.Arrays;

/**
 *
 * @author josia
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        // Variável p recebe o resultado da busca binária dentro do vetor vet
        int p = Arrays.binarySearch(vet, 1);
        
        // for repetindo uma vez para cada posição do vetor
        for (int vetor:vet) {
            System.out.print("[" + vetor + "]");
        }
        // \n é um dos comandos de escape do java, serve para quebrar a linha
        System.out.println("\nEncontrei o valor na posição " + p);
    }
    
}
