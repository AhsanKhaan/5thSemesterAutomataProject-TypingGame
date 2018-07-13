/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Ahsan khan
 */
public class mainController extends playerdata implements Initializable {

    
    @FXML
    private TextField name;

    @FXML
    private TextField id;
    @FXML
    private AnchorPane rootpane;
    @FXML
    private ImageView imageview;

    @FXML
    void savedplayer(ActionEvent event) throws IOException {
        if (game_data.getlist().contains(new object(name.getText()))) {
            
            //status.setTextFill(Color.rgb(255, 42, 0));
            System.out.println("I am in iF");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("game.fxml"));
                rootpane.getChildren().setAll(pane);
        } else {
           
            game_data.getlist().add(new object(name.getText()));
            System.out.println(game_data.getlist().size());
            game_data.setlist(game_data.getlist());
            System.out.println("I am in else");
            
           

            
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("game.fxml"));
                rootpane.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(mainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    playerdata game_data = new playerdata();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        status.setOnKeyPressed((KeyEvent var) -> {
//            switch (var.getCode()) {
//                case ENTER:
//                    if (game_data.getlist().contains(new object(name.getText(), id.getText()))) {
//                        status.setText("Change ID of player");
//                        status.setTextFill(Color.rgb(255, 42, 0));
//                        System.out.println("I am in iF");
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(mainController.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else {
//                        game_data.getlist().add(new object(name.getText(), id.getText()));
//                        status.setText("Player Saved");
//                        status.setTextFill(Color.rgb(255, 42, 0));
//                        System.out.println("I am in else");
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(mainController.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        });
File file = new File("src\\pro\\main\\cover2.jpg");
        Image image = new Image(file.toURI().toString());
        imageview.setImage(image);
    }

}
