package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CustomerMenu {

	public	void productSelScreen(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("ProductSelectionScreen.fxml"));
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
