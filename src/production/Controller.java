package production;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class Controller {
    @FXML
    Button btn;

    @FXML
    private void click(ActionEvent event){
        btn.setText("AaAAaaaAAaaAAAaa");
    }
}
