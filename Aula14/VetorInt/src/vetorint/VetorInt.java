/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorint;

/**
 *
 * @author josia
 */
public class VetorInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]]; //v[v[2]] = v[3]    v[v[1]] = v[0]
        
        for (int i: v) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
    }
    
}
