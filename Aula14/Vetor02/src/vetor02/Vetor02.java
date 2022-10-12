/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author josia
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago",
            "Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ano;
        
        // Solicita que o usuário informe o ano atual
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        ano = teclado.nextInt();
        
        // Testa se o ano atual é bissexto, se for, fevereiro ganha mais um dia.
        if (ano%4 == 0) {
            tot[1] = tot[1] += 1;
        }
        
        for (int c = 0; c<mes.length; c++) {
            System.out.println("Em " + ano + " o mês de " + mes[c] + " tem " +
                    tot[c] + " dias ao todo.");
        }
    }
    
}
