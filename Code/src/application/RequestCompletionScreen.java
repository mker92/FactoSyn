package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RequestCompletionScreen implements Initializable {
	public ManageSuppliesClass mscReference;
	private String name;
	
	@FXML 
	private Label CompLabel;
	
	public void display(Stage currentStage, Request request, ManageSuppliesClass msc) throws IOException {
		System.out.println("srs.showRequests()");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RequestCompletionScreen.fxml"));
        Parent root = loader.load();
        
        RequestCompletionScreen controller = loader.getController();
        
        controller.mscReference = msc;
        
		controller.CompLabel.setText(request.reqName());
		        
        Scene scene = new Scene(root);
        currentStage.setScene(scene);
        currentStage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}