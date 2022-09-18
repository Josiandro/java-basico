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
        // TODO code application logic here
        String nome1 = "Josiandro";
        String nome2 = "Josiandro";
        String nome3 = new String("Josiandro");
        String res;
        
        //res = (nome1==nome2)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente"; //equals é um método que verificar se o conteúdo de um objeto é igual ao outro
        System.out.println(res);
    }
    
}
