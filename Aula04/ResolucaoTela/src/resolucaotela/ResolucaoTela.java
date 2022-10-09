/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

// Pacote/biblioteca para pegar as dimensões do monitor, por exemplo
import java.awt.Dimension;
// Pacote/biblioteca para pegar o kit de ferramentas padrão
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        // Carrega para "tk" o kit de ferramentas padrão
        Toolkit tk = Toolkit.getDefaultToolkit();
        // "d" recebe o tamanho da tela usando o método .getScreeenSize()
        Dimension d = tk.getScreenSize();
        // Imprime na tela a largura e altura do monitor, "d" (Dimension) recebeu o conteúdo do "tk" (Toolkit) e depois usou dois métodos para pegar largura e altura
        System.out.println("Sua tela tem a resolução " + d.width + " x " + d.height + " px");
    }    
}
