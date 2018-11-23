/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaudio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 042131009
 */
public class AppAudio extends Application {
    
    @Override
    public void start(Stage palco) throws Exception {
        Parent historia = FXMLLoader.load(getClass().getResource("Tela.fxml"));
        
        Scene cena = new Scene(historia);
        
        palco.setScene(cena);
        palco.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
