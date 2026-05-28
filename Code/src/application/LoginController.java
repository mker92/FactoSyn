package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginController {

	public	void openCustomerLoginScreen(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
			Scene scene = new Scene(root);
			
			Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			
			Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
			
			newstage.setScene(scene);
			newstage.setTitle("FactoSyn");
			newstage.getIcons().add(small_app);
			newstage.setResizable(false);
			newstage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

   public	void openStaffLoginScreen(ActionEvent event) {
	 try {
		Parent root = FXMLLoader.load(getClass().getResource("StaffLogin.fxml"));
		Scene scene = new Scene(root);
		
		Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		
		Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
		
		newstage.setScene(scene);
		newstage.setTitle("FactoSyn");
		newstage.getIcons().add(small_app);
		newstage.setResizable(false);
		newstage.show();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
 }
}
