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
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ProductInfoScreen {

	@FXML
	private Label product;
	
	@FXML
	private TextArea info;
	
	public String offerproduct;
	
	public void setProduct(String productname) {
		product.setText(productname);
		getProductInfo(productname);
		offerproduct = productname;
	}
	
	public void getProductInfo(String productName) {
		try {
			InputStream input = getClass().getResourceAsStream("Products.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			
			while( ( line = reader.readLine() ) != null) {
				String[] selectedProduct = line.split("-");
				if(selectedProduct[0].equals(productName)) {
					info.appendText(selectedProduct[1]);
					info.setWrapText(true);
					reader.close();
					return;
				}
				else {
					info.setText("Δεν μπορέσαμε να ανακτήσουμε τα στοιχεία του προϊόντος.");
				}
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public	void orderScreen(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderInputScreen.fxml"));
			Parent root = loader.load();
			OrderInputScreen control = loader.getController();
			control.setFinalProduct(offerproduct);
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
