package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ProductSelectionScreen {
	
	@FXML
	private AnchorPane uploadMsg;
    
	public	void prodListScreen(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("ProductListScreen.fxml"));
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
	
	public void uploadMessage(ActionEvent event) {
		uploadMsg.setVisible(true);
	}
	
	
	public void fileUpload(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("UploadFileScreen.fxml"));
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
