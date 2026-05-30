package application;

public class Supplies{
	
	public boolean checkAvailability(Request request) {
		if (request.reqName().equals("No_Availability")) {
			return false;
		}else {
			return true;
		}
		
	}
}