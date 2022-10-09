/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

// Importação dos pacotes necessários
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

// Implements está fazendo uma interface, será visto em outro curso
public class FXMLDocumentController implements Initializable {
    
    // Comandos para adição dos controles, botão e label nesse caso
    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
    //Código do evento de clique no botão
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
