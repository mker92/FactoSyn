package application;

import java.util.ArrayList;
import java.util.List;

public class SupplyRequests{
	
	public String reqName;
	public String reqStatus;
	

	List<Request> requestlist = new ArrayList<>();
	
	
	public List<Request> queryRequests() {
		System.out.println("sr.query");
		//simulating the results of a query by adding some examples
		Request r1 = new Request("r1", false);
		Request Avail = new Request("Availability", true);
		Request noAv = new Request("No_Availability", true);
		
		requestlist.add(r1);
		requestlist.add(Avail);
		requestlist.add(noAv);
		
		return requestlist;
	}
	
	public void sendSupplyRequest(){
		
	}
	
	public void showRequests() {
		
	}
	
	public void requestsCompleted(Request request) {
		System.out.println("sr.requestsCompleted()");

        Request updatedRequest = new Request(request.reqName(), false);
        int index = requestlist.indexOf(request);
        requestlist.set(index, updatedRequest);
        System.out.println("sr.requestsCompleted reqlist: "+ requestlist);
	}
	
	public void requestPending() {
		
	}
}