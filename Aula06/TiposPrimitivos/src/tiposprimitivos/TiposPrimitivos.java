/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author josia
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variável "nota" recebendo o valor 8.5, o f indica que o valor de entrada será de fato float
        float nota = 8.5f;
        String nome = "Josiandro";
        
        // Imprime a nota na tela e fica na mesma linha
        System.out.print("1º A nota é " + nota);
        // Imprime a nota na tela e salta para a próxima linha
        System.out.println("2º A nota é " + nota);
        // Imprime a nota na tela, salta para a próxima linha e formata a saída
        System.out.printf("3º A nota de %s é %.4f \n", nome, nota);
        // Imprime a nota na tela, salta para a próxima linha e formata a saída
        System.out.format("4º A nota de %s é %.4f \n", nome, nota);
    }
    
}
