package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SupplyRequestsScreen implements Initializable{
	private ManageSuppliesClass mscReference;
	
	@FXML
	private ChoiceBox<String> RequestsChoiceBox;
	
	private Stage stage;
	
	List<Request> requestlist = new ArrayList<>();
	
	
	public void showRequests(Stage currentStage, List<Request> requests, ManageSuppliesClass msc) throws IOException {
		System.out.println("srs.showRequests()");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RequestsScreen.fxml"));
        Parent root = loader.load();
        
        SupplyRequestsScreen controller = loader.getController();
        
        controller.mscReference= msc;
        
        for (Request req : requests) {
            if (req.reqStatus()) { 
                controller.RequestsChoiceBox.getItems().add(req.reqName());
            }
        }
        
        controller.stage = currentStage;
        Scene scene = new Scene(root);
        currentStage.setScene(scene);
        currentStage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	
	public void requestSelected(ActionEvent event) throws IOException {
		
		String selected = RequestsChoiceBox.getValue();
//		System.out.println("srs.picked"+ selected );
		mscReference.selectedRequest(selected, stage);
	}
	
}