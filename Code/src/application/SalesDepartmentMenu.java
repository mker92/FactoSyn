package application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class SalesDepartmentMenu {
	public void openWindow() {
        Button priceOffer = new Button("Τιμολόγηση προσφοράς");
		
        Stage newStage = new Stage();
        newStage.setTitle("FactoSyn");
        
        HBox layout = new HBox(1);
        layout.getChildren().add(priceOffer);
        
        Scene scene = new Scene(layout, 300, 200);
        newStage.setScene(scene);
        newStage.show();
    }
}