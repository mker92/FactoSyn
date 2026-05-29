package application;

import java.io.IOException;
import java.util.List;

import javafx.stage.Stage;

public class ManageSuppliesClass{
	private SupplyDepartmentMenu sms;
	private SupplyRequests sr;
	private SupplyRequestsScreen srs;
	private Supplies supplies;

	
	public void searchRequests(Stage currentStage) throws IOException {
		System.out.println("msc.searchReq\n\tchose: διαχειρηση αιτηματος προμυθειων ");
		
		this.sr = new SupplyRequests();
		List<Request> requests = sr.queryRequests();
		System.out.println("msc.returned from search");
		
		this.srs = new SupplyRequestsScreen();
		srs.showRequests(currentStage, requests);
	}
	
	public void findSuppliers() {
		System.out.println("msc.searchReq\n\tchose: ανεφοδιασμος πρωτων υλων");
		
	}
}