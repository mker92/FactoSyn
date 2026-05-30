package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;



public class SupplyDepartmentMenu {
	private ManageSuppliesClass msc = new ManageSuppliesClass();
	

	public void manageSupplyRequests(ActionEvent event) throws IOException {
		System.out.println("sms.chose supplyrequest");
		Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    msc.searchRequests(currentStage);
	}
	
	public void resupplyMaterials(ActionEvent event) {
		System.out.println("sms.chose resupplyMaterials");
		msc.findSuppliers();
	}
}