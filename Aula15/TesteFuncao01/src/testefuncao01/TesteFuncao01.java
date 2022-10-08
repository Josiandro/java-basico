/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author josia
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    //Procedimentos, que são rotinas que não retornam valor
    static void soma(int a, int b){ //static torna o método estatico, ele vai funcionar apenas dentro da classe
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    //O método main é estatico (serve para classes e não para instancia), então
    // eu não posso chamar um procedimento dentro de um método estático, se esse
    // procedimento também não for estático.
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5,2);
    }
    
}
