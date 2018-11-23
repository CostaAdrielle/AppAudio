/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaudio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;

/**
 *
 * @author 042131009
 */
public class Controller implements Initializable {
    String musica1 = getClass().getResource("PillowTalk.mp3").toString();
    String musica2 = getClass().getResource("KnowUAnymore.mp3").toString();
    
    AudioClip clip1 = new AudioClip(musica1);
    AudioClip clip2 = new AudioClip(musica2);
    
    AudioClip singles[] = {clip1, clip2};
    int index = 0;
    
    
    @FXML
    private void play(ActionEvent event) {
        if(singles[index].isPlaying()){
                singles[index].stop();
    } else {
            singles[index].play();
        }
    }
    
    @FXML
    private void next(ActionEvent event) {
        singles[index].stop();
        try{
            index = index + 1;
            singles[index].play();
        } catch(Exception e){
            index = index - 1;
        }
    }
    
     @FXML
    private void previous(ActionEvent event) {
        singles[index].stop();
        try{
            index = index - 1;
            singles[index].play();
        } catch(Exception e){
            index = index + 1;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
