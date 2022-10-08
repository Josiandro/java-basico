/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorstring;

/**
 *
 * @author josia
 */
public class VetorString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String s que recebe a palavra/frase
        String s = "CURSOEMVIDEO";
        //Vetor de string char
        char [] r = new char[12];
        
        //For que alimenta o vetor r com o conteúdo da string s
        for (int c = s.length()-1; c >= 0; c--) {
            r[c] = s.charAt(c); //Lista o caracter char da posição c
        }
        
        //For each que escreve o conteúdo do vetor r
        for (char l: r) {
            System.out.print(l);
        }
        
        System.out.println(" ");
    }
    
}
