package application;

public class ManageSuppliesClass{
	private SupplyDepartmentMenuScreen sms;
	private SupplyRequests sr;
	private SupplyRequestsScreen srs;
	private Supplies supplies;
	
	public void init() {
		System.out.println("msc");
		this.sms = new SupplyDepartmentMenuScreen();		
		sms.display();
	}
	
	public void searchRequests() {
		System.out.println("msc.searchReq\n\tchose: διαχειρηση αιτηματος προμυθειων ");
//		this.sr = new SupplyRequests();
//		sr.queryRequests();
	}
	
	public void findSuppliers() {
		System.out.println("msc.searchReq\n\tchose: ανεφοδιασμος πρωτων υλων");
		
	}
}