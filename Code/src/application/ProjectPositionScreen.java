package application;
import java.util.List;
public class ProjectPositionScreen {
public void showPositions(Project project) {
List<String> positions = project.getProjectPositions();
for (String position : positions) {
System.out.println(position);
}
}
public void showWorkerList() {
System.out.println("Open worker list screen");
}
}