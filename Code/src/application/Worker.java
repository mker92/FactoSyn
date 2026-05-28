package application;
import java.util.ArrayList;
import java.util.List;
public class Worker {

private int workerId;
private String name;
private boolean available;

public Worker() {
}
public Worker(int workerId, String name, boolean available) {
this.workerId = workerId;
this.name = name;
this.available = available;
}

public static List<Worker> getWorkers() {
List<Worker> workers = new ArrayList<>();

workers.add(new Worker(1, "Nikos", true));
workers.add(new Worker(2, "Maria", true));
workers.add(new Worker(3, "Giorgos", false));
return workers;
}
public boolean isAvailable() {
	return available;
}

public int getWorkerId() {
return workerId;
	    }

public String getName() {
return name;
	    }
	}


