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

public class CustomerLogin {

	@FXML
	private TextField enteredUsername;
	
	@FXML
	private PasswordField enteredPassword;
	
	@FXML
	private Label invalidLogin;
	
	public void validateLoginCredentials(ActionEvent event) {
		String username = enteredUsername.getText();
		String password = enteredPassword.getText();
		
		invalidLogin.setVisible(false);
		
		try {
			InputStream input = getClass().getResourceAsStream("Customers.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			
			while( (line = reader.readLine()) != null) {
				String[] credentials = line.split("-");
				String storedUsername = credentials[0];
				String storedPassword = credentials[1];
				
				if(username.equals(storedUsername) && password.equals(storedPassword)) {
					openCustomerMenu(event);
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
	
	   public	void openCustomerMenu(ActionEvent event) {
			 try {
				Parent root = FXMLLoader.load(getClass().getResource("CustomerMenu.fxml"));
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
