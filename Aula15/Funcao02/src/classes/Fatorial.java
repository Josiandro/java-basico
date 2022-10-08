/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author josia
 */
public class Fatorial {
    
    // Atributos do objeto/classe fatorial
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    // Métodos do objeto/classe fatorial
    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        
        for (int c = n; c > 1; c--) {
            System.out.println(f + " x " + c); //Testa o for
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;
    }
}

