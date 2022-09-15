/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.util.Date; //Importação de componente necessário para uso da classe Date

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); //Criação do objeto relógio (sempre que tiver new, é objeto)
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString()); //Método toString convertendo a saída de Date para String
    }
    
}
