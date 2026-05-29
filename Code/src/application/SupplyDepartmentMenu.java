package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class SupplyDepartmentMenu {
	private ManageSuppliesClass msc = new ManageSuppliesClass();
	public void openWindow() {
        Button supplyRequest = new Button("Διαχείρηση αιτήματος προμηθειών");
        Button resupplyMaterials = new Button("Ανεφοδιασμός πρώτων υλών");
		
        supplyRequest.setOnAction(event -> {
	    	System.out.println("sms.chose supplyrequest");
	    	msc.searchRequests();
	    });
	    resupplyMaterials.setOnAction(event -> {
	    	System.out.println("sms.chose resupplymaterials");
	    	msc.findSuppliers();
	    });
	    
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