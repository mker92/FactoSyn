package application;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class StaffLogin {


	@FXML
	private TextField enteredUsername;
	
	@FXML
	private PasswordField enteredPassword;
	
	@FXML
	private Label invalidLogin;
	
	public void validateStaffLoginCredentials(ActionEvent event) {
		String username = enteredUsername.getText();
		String password = enteredPassword.getText();
		
		invalidLogin.setVisible(false);
		
		try {
			InputStream input = getClass().getResourceAsStream("Staff.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			
			while( (line = reader.readLine()) != null) {
				String[] credentials = line.split("-");
				String storedUsername = credentials[0];
				String storedPassword = credentials[1];
				String storedDepartment = credentials[3];
				
				if(username.equals(storedUsername) && password.equals(storedPassword) && storedDepartment.equals("Supply")) {
					openSupplyMenu(event);
					reader.close();
					return;
				}
				else if(username.equals(storedUsername) && password.equals(storedPassword) && storedDepartment.equals("Sales")) {
					openSalesMenu(event);
					reader.close();
					return;
				}
				else if(username.equals(storedUsername) && password.equals(storedPassword) && storedDepartment.equals("Administrator")) {
					openAdministratorMenu(event);
					reader.close();
					return;
				}
				else if(username.equals(storedUsername) && password.equals(storedPassword) && storedDepartment.equals("Production")) {
					openProductionMenu(event);
					reader.close();
					return;
				}

			}
			reader.close();
			invalidLogin.setVisible(true);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	
	   public	void openSupplyMenu(ActionEvent event) {
			 try {
				Parent root = FXMLLoader.load(getClass().getResource("SupplyDepartmentMenu.fxml"));
				Scene scene = new Scene(root);
				
				Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				
				Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
				
				
				newstage.setScene(scene);
				newstage.setTitle("FactoSyn");
				newstage.getIcons().add(small_app);
				newstage.setResizable(false);
				newstage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		 }
	   
	   public	void openSalesMenu(ActionEvent event) {
			 try {
				Parent root = FXMLLoader.load(getClass().getResource("SalesDepartmentMenu.fxml"));
				Scene scene = new Scene(root);
				
				Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				
				Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
				
				
				newstage.setScene(scene);
				newstage.setTitle("FactoSyn");
				newstage.getIcons().add(small_app);
				newstage.setResizable(false);
				newstage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		 }
	   
	   
	   public	void openAdministratorMenu(ActionEvent event) {
			 try {
				Parent root = FXMLLoader.load(getClass().getResource("AdministratorMenu.fxml"));
				Scene scene = new Scene(root);
				
				Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				
				Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
				
				
				newstage.setScene(scene);
				newstage.setTitle("FactoSyn");
				newstage.getIcons().add(small_app);
				newstage.setResizable(false);
				newstage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		 }
	   
	   public	void openProductionMenu(ActionEvent event) {
			 try {
				Parent root = FXMLLoader.load(getClass().getResource("ProductionDepartmentMenu.fxml"));
				Scene scene = new Scene(root);
				
				Stage newstage = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				
				Image small_app = new Image(getClass().getResourceAsStream("Picture1.png"));
				
				
				newstage.setScene(scene);
				newstage.setTitle("FactoSyn");
				newstage.getIcons().add(small_app);
				newstage.setResizable(false);
				newstage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		 }
}
