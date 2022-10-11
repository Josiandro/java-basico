/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

// Importação de biblioteca/pacote para monitorar a entrada de dados
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criação do objeto tec do tipo Scanner para monitorar a entrada de dados
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Quantas pernas? ");
        // Variável "perna" recebe o valor inteiro que foi pego usando o método nextInt do objeto tec
        int perna = tec.nextInt();
        
        String tipo;
        System.out.print("Isso é um(a) ");
        
        // Estrura condicional switch (escolha caso), de acordo com o case, a variável "tipo" recebe um valor diferente
        switch (perna) {
            case 1:
                tipo = "Saci";
                break; // break interrompe o looping em vai para o final do laço
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default: // default é o caso padrão, ou seja, nenhum dos citados acima
                tipo = "ET";
                break;
        }
        
        System.out.println(tipo);
    }
    
}
