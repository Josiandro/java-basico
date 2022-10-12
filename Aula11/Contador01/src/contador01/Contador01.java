/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author josia
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        // Repete o bloco enquanto (while) cc for menor que 10
        while (cc<10) {
            // Incrementa cc com mais 1
            cc++;
            // Se o teste do if for verdadeiro, é executado o "continue", interrompe o loço de repetição e começa executar o fluxo de novo
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            // Se o teste do if for verdadeiro, é executado o "break", quebra o laço de repetição e vai para o final direto
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
