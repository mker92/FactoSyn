package application;

import java.io.FileWriter;
import java.time.LocalDate;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;

public class OrderInputScreen {

	@FXML
	private Label finalProduct;
	
	@FXML
	private Spinner<Integer> quantitySet;
	
	@FXML
	private DatePicker deliveryDate;
	
	@FXML
	private AnchorPane completeMessage;
	
	String offerProduct;
	String offerProductInfo;
	
	public void initialize() {
		
		SpinnerValueFactory<Integer> value = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
		quantitySet.setValueFactory(value);
	}
	
	public void setFinalProduct(String product,String productInfo) {
		finalProduct.setText(product);
		offerProduct = product;
		offerProductInfo = productInfo;
	}
	
	public void createOfferRequest(ActionEvent event) {
		LocalDate date = deliveryDate.getValue();
		int quantity = quantitySet.getValue();
		
		try {
			
			FileWriter writer = new FileWriter("OfferRequests.txt",true);
			writer.write(offerProduct + "____" + offerProductInfo + "____" + quantity + "____" + date + "\n\n\n");
			writer.close();
			
			completeMessage.setVisible(true);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exitbut(ActionEvent event) {
		Platform.exit();
	}
	
}
