package application;
import java.util.List;

public class WorkerListScreen {
public void showWorkerList() {
List<Worker> workers = Worker.getWorkers();

for (Worker worker : workers) {
System.out.println(worker.getName());
}
}
public List<Worker> getWorkers() {
return Worker.getWorkers();
}
public void showPositions() {
System.out.println("Return to project positions screen");
}
public void showConfirmation() {
System.out.println("Open confirmation screen");
}
}