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
        float nota = 8.5f;
        String nome = "Josiandro";
        
        System.out.print("1º A nota é " + nota);
        System.out.println("2º A nota é " + nota);
        System.out.printf("3º A nota de %s é %.4f \n", nome, nota);
        System.out.format("4º A nota de %s é %.4f \n", nome, nota);
    }
    
}
