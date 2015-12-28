package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class MainController implements Initializable {

	@FXML
	private Text text;
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me! Have a great day. :)");
        text.setText("Hello, Hope everything worked for you.");
    }
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
}
