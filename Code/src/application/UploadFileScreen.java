package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class UploadFileScreen {

	@FXML
	private TextArea fileInfo;
	
	@FXML
	private Button savebut;
	
	String offerproduct;
	String prodInfo;
	
	
	public void initialize() {
		savebut.setDisable(true);
	}
	
	public void interactiveFileChooser(ActionEvent event) {
		try {
			
			FileChooser chooser = new FileChooser();
			chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter( "Text Files", "*.txt" ) );
			
			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			File file = chooser.showOpenDialog(stage);
			
			if(file != null) {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				
				while( ( line = reader.readLine() ) != null) {
					if(line.contains("---")) {
						String[] newProduct = line.split("---");
						offerproduct = newProduct[0];
						prodInfo = newProduct[1];
					}
					else {
						prodInfo += line;
					}
					
				}
				reader.close();
				fileInfo.setText(" Όνομα Προϊόντος: " + offerproduct + "\n\n\n" + " Προδιαγραφές Προϊόντος: " + prodInfo);
				fileInfo.setWrapText(true);
				savebut.setDisable(false);
			}
			else {
				fileInfo.setText("Το αρχείο που προσπαθήσατε να ανεβάσετε δεν είναι προσβάσιμο. Δοκιμάστε ξανά με νέο αρχείο.");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void saveFile(ActionEvent event) {
		try {
			
			FileWriter writer = new FileWriter("TechnicalDocument.txt",true);
			writer.write(offerproduct + "____" + prodInfo  + "\n\n\n" );
			writer.close();
			orderScreen(event);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public	void orderScreen(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderInputScreen.fxml"));
			Parent root = loader.load();
			OrderInputScreen control = loader.getController();
			control.setFinalProduct(offerproduct,prodInfo);
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
