package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class ProductionDepartmentMenu {
	public void openWindow() {
        Button assignWorkers = new Button("Ανάθεση εργατών");
        Button assignMachine = new Button("Δέσμευση μηχανής");
        Button fixMachine = new Button("Eπιδιόρθωση ελλατωματικής μηχανής");
        Button orderUpdate = new Button("Ενημέρωση κατάστασης παραγγελίας");
        
        
		
        Stage newStage = new Stage();
        newStage.setTitle("FactoSyn");
   
        
        HBox layout = new HBox(4);
        layout.getChildren().add(assignWorkers);
        layout.getChildren().add(assignMachine);
        layout.getChildren().add(fixMachine);
        layout.getChildren().add(orderUpdate);
        
        Scene scene = new Scene(layout, 800, 200);
        newStage.setScene(scene);
        newStage.show();
    }
}