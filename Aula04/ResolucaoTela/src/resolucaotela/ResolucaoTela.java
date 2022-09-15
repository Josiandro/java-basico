/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit(); //Obtem o kit de ferramentas padrão
        Dimension d = tk.getScreenSize(); //Pega a largura e altura de um "componente", neste caso o Toolkit
        System.out.println("Sua tela tem resolução " + d.width + " x " + d.height); //Devolve a largura e altura pega no Toolkit
    }
    
}
