package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("InitialScreen.fxml"));
			Scene scene = new Scene(root);
			
			Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("FactoSyn");
			primaryStage.getIcons().add(small_app);
			primaryStage.setResizable(false);
			primaryStage.show();
			
			
//			
//			CustomerMenu customerMenu = new CustomerMenu();
//			customerMenu.openWindow();
//			
//			
//			
//			SalesDepartmentMenu salesDepartmentMenu = new SalesDepartmentMenu();
//			salesDepartmentMenu.openWindow();
//			
//			
//	
//			ProductionDepartmentMenu productionDepartmentMenu = new ProductionDepartmentMenu();
//			productionDepartmentMenu.openWindow();
//		
//			
//		
//			SupplyDepartmentMenu supplyDepartmentMenu = new SupplyDepartmentMenu();
//			supplyDepartmentMenu.openWindow();
//			
//			
//			AdministratorMenu administratorMenu = new AdministratorMenu();
//			administratorMenu.openWindow();
//			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}