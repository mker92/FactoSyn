package application;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ProductListScreen {
    
	@FXML
	private VBox productList;
	
	public void getProductList() {
		try {
			
			InputStream input = getClass().getResourceAsStream("Products.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			
			while( ( line = reader.readLine() ) != null) {
				String[] product = line.split("-");
				Button button = new Button(product[0]);
				button.setMaxWidth(Double.MAX_VALUE);
				
				button.setOnAction(event ->{
					prodInfoScreen();
				});
				
				productList.getChildren().add(button);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void prodInfoScreen() {
		
	}
}
