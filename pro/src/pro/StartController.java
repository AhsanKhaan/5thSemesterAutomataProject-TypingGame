/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;

import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahsan khan
 */
public class StartController extends playerdata implements Initializable {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private Text text;
    @FXML
    private TextField input;
    @FXML
    private Label label;
    public static int index = 0;
    playerdata pd = new playerdata();
    @FXML
    private ImageView imageview;

    /**
     * Initializes the controller class.
     *
     * @param ae
     * @throws java.io.IOException
     * @throws java.lang.reflect.InvocationTargetException
     */
    @FXML
    public void OnEnter(ActionEvent ae) throws IOException, InvocationTargetException, InterruptedException {

        Dfalist fa = new Dfalist();
        if (fa.getdfalist().get(index).getdfa().validate(input.getText())) {
            label.setText("right");
            pd.setscore(pd.getscore() + 1);
            File file = new File("src\\pro\\images\\shoot0.png");
            Image image = new Image(file.toURI().toString());
            imageview.setImage(image);
//            Thread.sleep(1000);
//            File file1 = new File("src\\pro\\images\\aim0.png");
//            Image image1 = new Image(file1.toURI().toString());
//            imageview.setImage(image1);

        } else {
            label.setText("wrong");
            File file = new File("src\\pro\\images\\fail.png");
            Image image = new Image(file.toURI().toString());
            imageview.setImage(image);

        }
      

        input.setText("");
        if (index != fa.getdfalist().size()) {
            index++;
           this.setimage();
            text.setText(fa.getdfalist().get(index).getlabel());

        }
        System.out.println(pd.getscore());
        System.out.println(pd.getlist().size());    
        if (index == fa.getdfalist().size()) {
        
            text.setText("Game Over");
            label.setText("Click Game Over Button to Quit The Game");
//            input.setOnKeyPressed((KeyEvent e)->{
//                if (e.getCode()==ENTER) {
//                    System.out.println("i am in if of onenter");
//            this.gameover(ae);
//                }
//            });
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Dfalist fa = new Dfalist();
        text.setText(fa.getdfalist().get(index).getlabel());
        File file = new File("src\\pro\\images\\aim0.png");
        Image image = new Image(file.toURI().toString());
        imageview.setImage(image);

    }
    public void setimage() throws InterruptedException{
     Thread.sleep(1000);
         File file = new File("src\\pro\\images\\aim0.png");
           Image image = new Image(file.toURI().toString());
            imageview.setImage(image);
    }

    @FXML
    private void gameover(ActionEvent event) {
        
        AnchorPane pane;
        try {
            pane = FXMLLoader.load(getClass().getResource("gameover.fxml"));
            rootpane.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(StartController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
