package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class OrderInputScreen {

	@FXML
	private Label finalProduct;
	
	@FXML
	private Spinner<Integer> quantitySet;
	
	public void initialize() {
		
		SpinnerValueFactory<Integer> value = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
		quantitySet.setValueFactory(value);
	}
	
	public void setFinalProduct(String product) {
		finalProduct.setText(product);
	}
}
