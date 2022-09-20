/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

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
        // TODO code application logic here
        
        //Scanner para monitorar as entradas, ou seja, in.
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2;        
        System.out.println("Sua média foi " + m);
        
        //Teste condicional simples para felicitar o aluno
        if (m>9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
