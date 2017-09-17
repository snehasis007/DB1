package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text target;
   @FXML protected void handleSubmt(ActionEvent actionEvent) {
       target.setText("Hi how are you?");
    }
}
