/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao03;

/**
 *
 * @author josia
 */
public class Operacoes {
    
    //Método público que pode ser chamada de qualquer lugar
    public static String contador (int i, int f) {
        String s = "";
        
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
    
}
