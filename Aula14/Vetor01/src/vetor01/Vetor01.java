/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author josia
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int n[] = new int[4]; Declaração do vetor vazio com 4 posições
        // Declaração do vetor já preenchendo as 4 posições
        int n[] = {3,2,8,7,5,4};
        
        // length é um metódo para pegar o tamanho do vetor
        //System.out.println("Total de casas de N " + n.length);
        
        // Usa o tamanho do vetor (length) para controlar as repetições, -1 porque o tamanho é 4, mas o vetor começa em 0 e vai até 3
        for (int c = 0; c <= n.length - 1; c++) {
            System.out.println("Na posição [" + c + "] temos o valor: " + n[c]); 
        }
    }

}
 
