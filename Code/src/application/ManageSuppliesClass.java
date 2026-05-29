package application;

import java.util.List;

public class ManageSuppliesClass{
	private SupplyDepartmentMenu sms;
	private SupplyRequests sr;
	private SupplyRequestsScreen srs;
	private Supplies supplies;
	
	public void init() {
		System.out.println("msc");
		this.sms = new SupplyDepartmentMenu();		
		sms.openWindow();
	}
	
	public void searchRequests() {
		System.out.println("msc.searchReq\n\tchose: διαχειρηση αιτηματος προμυθειων ");
		
		this.sr = new SupplyRequests();
		List<Request> requests = sr.queryRequests();
		System.out.println("msc.returned from search");
		
		this.srs = new SupplyRequestsScreen();
		srs.showRequests(requests);
	}
	
	public void findSuppliers() {
		System.out.println("msc.searchReq\n\tchose: ανεφοδιασμος πρωτων υλων");
		
	}
}