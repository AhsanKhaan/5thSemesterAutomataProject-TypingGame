/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Ahsan khan
 */
public class GameoverController extends playerdata implements Initializable {

    @FXML
    private ImageView imageview;
    @FXML
    private Label name;
    @FXML
    private Label score;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    File f=new File("src\\pro\\main\\gameover.jpg");
    Image im=new Image(f.toURI().toString());
    imageview.setImage(im);
    playerdata pd=new playerdata();
    
       
    }    
    
}
