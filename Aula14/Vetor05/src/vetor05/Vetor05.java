/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

// Importação do pacote/biblioteca para trabalhar com vetores
import java.util.Arrays;

/**
 *
 * @author josia
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        
        //Preenche o vetor com um valor pré-definido
        Arrays.fill(v, 0); 
        
        for (int vetor:v) {
            System.out.print(vetor + " ");
        }
    }
    
}
