package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class CustomerMenu {
	public void openWindow() {
        Button acceptOffer = new Button("Αποδοχή προσφοράς");
        Button requestOffer = new Button("Αίτημα προφοράς");
		
        Stage newStage = new Stage();
        newStage.setTitle("FactoSyn");
   
        
        HBox layout = new HBox(2);
        layout.getChildren().add(acceptOffer);
        layout.getChildren().add(requestOffer);
        
        Scene scene = new Scene(layout, 300, 200);
        newStage.setScene(scene);
        newStage.show();
    }
}