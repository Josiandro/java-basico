/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

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
        int p = Arrays.binarySearch(vet, 1); //Procura o valor que passei dentro do vetor
        
        for (int vetor:vet) {
            System.out.print("[" + vetor + "]");
        }
        
        System.out.println("\nEncontrei o valor na posição " + p);
    }
    
}
