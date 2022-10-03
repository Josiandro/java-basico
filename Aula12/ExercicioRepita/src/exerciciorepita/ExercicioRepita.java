/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

//Importando pacote com as janelas prontas
import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
    
        int v;
        int n;
        int c = 0;
        int s = 0;
        int i = 0;
        int p = 0;        
        int a = 0;
        float m;
        
        do {
            // Criação da janela padrão e passagem do valor digitado para a variável "v".
            v = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em><html>"));
            // Testa o valor da variável "v" e caso seja zero, não considera como um valor válido e que deve ser contabilzado.
            if (v != 0) {
                // Valor válido, variável "n" receber recebe o valor de "v".
                n = v;
                // Variável "s" recebe ela mesma, mais "n".
                s += n;
                // Testa o valor de "n" para saber se é Par ou Ímpar.
                if (n%2==0) {
                    p++;
                } else {
                    i++;
                }
                // Testa se o valor é maior do que 100 e soma mais 1 na variável "a".
                if (n>100) {
                    a++;
                }
                // Somar mais um na variável "c" que é o contador.
                c++;
            }
        } while (v != 0); // Enquanto o valor for diferente de zero, segue repetindo o looping.
        // Variável "m" recebe a média dos valores digitados.
        m = (float) s/c;
        // Impressão dos resultados na tela.
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "<br>Total de Valores: "  + s +
                "<br>Total de Pares: "    + p +
                "<br>Total de Ímpares: "  + i +
                "<br>Acima de 100: "      + a +
                "<br>Média dos valores: " + m + 
                "</html>");
    }
}
