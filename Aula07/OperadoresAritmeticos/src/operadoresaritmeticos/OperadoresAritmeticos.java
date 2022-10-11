/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author josia
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // Variáveis "n1" e "n2" recebendo valores
        int n1 = 3;
        int n2 = 5;
        // Variável "m" recebendo a média
        float m = (n1 + n2)/2;
        // Exibe a média na tela
        System.out.println("\"m = (n1 + n2)/2\"                | Resultado: " + m);
        
        //---------------------------------------------------
        
        int numero = 10;
        // Variável "valor" recebe o a soma de 4 com o valor da variável número. Depois (pós incremento) diminui 1 de numero)
        int valor = 4 + numero--;
        System.out.println("\"valor = 4 + numero--\"           | Resultado: " + valor);
        
        //---------------------------------------------------
        
        int x = 4;
        // Variável x *= 2 é o mesmo que x = x * 2
        x *= 2;
        System.out.println("\"x *= 2\"                         | Resultado: " + x);
        
        //---------------------------------------------------
        
        float v = 8.4f;
        // Variável "ar" recebe o arredondamento matemático de "v", 8,4 está mais perto de 8, então converte para int
        int ar = (int) Math.round(v);
        System.out.println("\"ar = (int) Math.round(v)\"       | Resultado: " + ar);
        
        //---------------------------------------------------
        
        // Variável "ale" do tipo double recebe um valor aletório
        double ale = Math.random();
        // Variável "n" do tipo int recebe um número aleatório entre 15 e 50
        int n = (int) (15 + ale * (50-15));
        System.out.println("\"n = (int) (15 + ale * (50-15))\" | Resultado: " + n);
    }    
}
