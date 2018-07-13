/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahsan khan
 */
public class GameController implements Initializable {

    @FXML
    private MediaView media;
    private static final String MEDIA_URL = "cs.mp4";
    @FXML
    private Button exit;
    @FXML
    private AnchorPane rootpane;

    /**
     * Initializes the controller class.
     */
    MediaPlayer MediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());
        //MediaPlayer MediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));
        MediaPlayer.setAutoPlay(true);
        media.setMediaPlayer(MediaPlayer);
    }

    @FXML
    private void highscore(ActionEvent event) {

    }

    @FXML
    private void newgame(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("start.fxml"));
        rootpane.getChildren().setAll(pane);
        MediaPlayer.stop();
    }

    @FXML
    private void exitgame(ActionEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

}
