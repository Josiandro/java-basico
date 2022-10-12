/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

// Importação de pacote/biblioteca para trabalhar com vetores
import java.util.Arrays;

/**
 *
 * @author josia
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        
        // Classe com método que coloca o vetor em ordem de forma automática
        Arrays.sort(v); 
        
        //For each / "Para cada" ele é específico para vetores
        for (double valor:v) { // Vai percorrer o vetor para cada posição
            System.out.print(valor + " ");
        }
    }
    
}
