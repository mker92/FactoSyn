package application;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SupplyRequestsScreen{
	private Stage stage;
	private Scene scene;
	private Parent parent;
	
	public void showRequests(Stage currentStage, List<Request> requests) throws IOException {
		System.out.println("srs.showRequests()");
		Parent root = FXMLLoader.load(getClass().getResource("RequestsScreen.fxml"));
		this.stage = currentStage;
		this.scene = new Scene(root);
//		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}