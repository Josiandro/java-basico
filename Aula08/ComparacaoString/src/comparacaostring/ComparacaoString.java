/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author josia
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variáveis "nome1" e "nome2" String recebendo o mesmo texto
        String nome1 = "Josiandro";
        String nome2 = "Josiandro";
        // Variável "nome3" criando objeto String (classe invólucro) recebendo o mesmo texto
        String nome3 = new String("Josiandro");
        String res;
        
        // Operador Ternário: Testa se nome1==nome2 e atribui para res "igual" ou "diferente"
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println("nome1==nome2: " + res);
        
        // "nome1" e "nome3" possuem o mesmo conteúdos, mas não são variaveis iguais, o médoto equals compara o conteúdo dos objetos
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println("nome1.equals(nome3): " + res);
    }
    
}
