/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorelogicos;

/**
 *
 * @author josia
 */
public class OperadoreLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaração de várias variáveis do mesmo tipo e ao mesmo tempo
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        // Uso de operador ternário para teste lógico com OU exclusivo
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
    
}
