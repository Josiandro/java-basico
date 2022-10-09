/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

// Importação da biblioteca/pacote java.util.Locale (necessária para o uso da classe Locale)
import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        // Criação do objeto "loc" usando a clsse Locale, ele pega o idioma padrão da JVM
        Locale loc = Locale.getDefault();
        // Imprime na tela a linguagem padrão do sistema, pega através do método getDisplayLanguage
        System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
    }    
}
