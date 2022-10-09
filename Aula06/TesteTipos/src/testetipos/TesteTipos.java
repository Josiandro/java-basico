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
        // Variável "idade" do tipo int recebe o valor 30
        int idade = 30;
        // Variável "valor" do tipo String recebe a conversão de "idade" que é int para String, usando o método toString e classe invólucro
        String valor = Integer.toString(idade);
        // Imprime o valor da classe "valor" e salta a linha
        System.out.println("Conversão de int para String: " + valor);
        
        //------------------------------
        
        // Variável "valor2" do tipo String recebe o valor 40
        String valor2 = "40";
        // Variável "idade2" do tipo int recebe a conversão de "valor2" que é String para int, usando o método parseInt e classe invólucro
        int idade2 = Integer.parseInt(valor2); //parse é converter, ou seja, converte de String para int
        // Imprime o valor da classe "valor" e salta a linha
        System.out.println("Conversão de String para int: " + idade2);
        
        //------------------------------
        
        // Variável "valor3" do tipo String recebe o valor 30.5
        String valor3 = "30.5";
        // Variavel "idade3" do tipo float recebe a conversão de "valor3" que é String para float, usando o método parseFloat e classe invólucro
        float idade3 = Float.parseFloat(valor3);
        // Imprime o valor da clsse "idade3" e salta a linha
        System.out.printf("Conversão de String para float: %.3f \n", idade3);
    }    
}

/*
 * System.out.printf
 * printf permite formatar a saída, assim como o format
 * %.3f indica que a saída terá 3 casas decimais
 * \n indica que depois do texto, irá saltar para a próxima linha
 */
