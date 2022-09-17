/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author josia
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);//Converte de int para String usando metódos e classe invólucro
        System.out.println(valor);
        
        //------------------------------
        
        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2); //parse é converter, ou seja, converte de String para int
        System.out.println(idade2);
        
        //------------------------------
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("%.3f \n", idade3);
    }
    
}
