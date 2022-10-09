/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

// Importação da biblioteca/pacote java.util.Date (necessária para o uso da classe Date)
import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        // Criação do objeto relógio usando a classe Date() que é nativa do Java (sempre que tiver "new" é um objeto)
        Date relogio = new Date();
        // System.out.println escreve na tela e salta para a próxima linha
        System.out.println("A hora do sistema é");
        // toString() é um método da classe relógio, que transforma a saída em uma String
        System.out.println(relogio.toString());
    }    
}
