package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class SupplyDepartmentMenu {
	public void openWindow() {
        Button supplyRequest = new Button("Διαχείρηση αιτήματος προμηθειών");
        Button resupplyMaterials = new Button("Ανεφοδιασμός πρώτων υλών");
		
        Stage newStage = new Stage();
        newStage.setTitle("FactoSyn");
   
        
        HBox layout = new HBox(2);
        layout.getChildren().add(supplyRequest);
        layout.getChildren().add(resupplyMaterials);
        
        Scene scene = new Scene(layout, 600, 200);
        newStage.setScene(scene);
        newStage.show();
    }
}