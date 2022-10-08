/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author josia
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    
     //Função, que são rotinas retornam valor
    static int soma(int a, int b){ //static torna o método estatico, ele vai funcionar apenas dentro da classe
        int s = a + b;
        return s;
    }
    
    //O método main é estatico (serve para classes e não para instancia), então
    // eu não posso chamar um procedimento dentro de um método estático, se esse
    // procedimento também não for estático.
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        //Variável sm recebe o retorno da função soma
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
