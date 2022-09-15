/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault(); // Obtem a localização padrão que está na JVM
        System.out.println("Seu sistema está em " + loc.getDisplayLanguage()); //Devolve o idioma da localização padrão
    }
    
}
