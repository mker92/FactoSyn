package application;
import java.util.List;

public class ConfirmationScreen {
public boolean checkConflicts(List<Worker> selectedWorkers) {
for (Worker worker : selectedWorkers) {
if (!worker.isAvailable()) {
return true;
}
}
return false;
}
public void assignWorkers(Project project, List<Worker> selectedWorkers) {
for (Worker worker : selectedWorkers) {
if (worker.isAvailable()) {
System.out.println("Assigned worker: " + worker.getName());
}
}
}
public void confirmChoices(Project project, List<Worker> selectedWorkers) {
if (checkConflicts(selectedWorkers)) {
WorkerConflictMessage message = new WorkerConflictMessage();
message.showErrMessage();
}

assignWorkers(project, selectedWorkers);
}
}