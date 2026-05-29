package application;

import java.util.ArrayList;
import java.util.List;

public class SupplyRequests{
	
	public String reqName;
	public String reqStatus;
	

	List<Request> requestlist = new ArrayList<>();
	
	
	public List<Request> queryRequests() {
		System.out.println("sr.query");
		
		Request r1 = new Request("r1", false);
		Request r2 = new Request("r2", true);
		Request r3 = new Request("r1", true);
		
		requestlist.add(r1);
		requestlist.add(r2);
		requestlist.add(r3);
		
		return requestlist;
	}
	
	public void sendSupplyRequest(){
		
	}
	
	public void showRequests() {
		
	}
	
	public void requestsCompleted() {
		
	}
	
	public void requestPending() {
		
	}
}