package application;

import java.io.IOException;
import java.util.List;

import javafx.stage.Stage;

public class ManageSuppliesClass{
	private SupplyDepartmentMenu sms;
	private SupplyRequests sr;
	private SupplyRequestsScreen srs;
	private Supplies supplies = new Supplies();
	
	List<Request> requests;
	Request requestToWork;
	
	public void searchRequests(Stage currentStage) throws IOException {
		System.out.println("msc.searchReq\n\tchose: διαχειρηση αιτηματος προμυθειων ");
		
		this.sr = new SupplyRequests();
		this.requests = sr.queryRequests();
		System.out.println("msc.returned from search");
		
		this.srs = new SupplyRequestsScreen();
		srs.showRequests(currentStage, requests, this);
	}
	
	public void selectedRequest(String selectedreq, Stage currentStage) throws IOException {
		System.out.println("msc.selectedRequest");
		for (Request req : requests) {
			if(req.reqName().equals(selectedreq)) {
				requestToWork = req;
			}
		}
		
		System.out.println("msc.selactedRequest: "+ requestToWork);
		
		supplies.checkAvailability(requestToWork);
		
		sr.requestsCompleted(requestToWork);
		
		RequestCompletionScreen completed = new RequestCompletionScreen();
		completed.display(currentStage, requestToWork, this);
	}
	public void findSuppliers() {
		System.out.println("msc.searchReq\n\tchose: ανεφοδιασμος πρωτων υλων");
		
	}
}