package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class AdministratorMenu {
	public void openWindow() {
        Button editProductBOM = new Button("Επεξεργασία λίστας υλικών προϊόντος");
        Button createNewProduct = new Button("Δημιουργία νέου προϊόντος");
        Button registerProject = new Button("Καταχώρηση έργου");	
		
        Stage newStage = new Stage();
        newStage.setTitle("FactoSyn");
   
        
        HBox layout = new HBox(4);
        layout.getChildren().add(editProductBOM);
        layout.getChildren().add(createNewProduct);
        layout.getChildren().add(registerProject);
        
        Scene scene = new Scene(layout, 1000, 200);
        newStage.setScene(scene);
        newStage.show();
    }
}