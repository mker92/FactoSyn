package application;
import java.util.ArrayList;
import java.util.List;

public class Project {
private int projectId;
private String status;
private int producedItems;
private int requiredItems;
public Project() {
}
public Project(int projectId, String status, int requiredItems) {
	this.projectId = projectId;
	this.status = status;
	this.requiredItems= requiredItems;
	this.producedItems = 0;
}
public static List<Project> getProjectList(){
	List<Project> projects = new ArrayList<>();
	projects.add(new Project(1, "In Progress",100));
	projects.add(new Project(2, "In Progress",150));
	projects.add(new Project(3, "Pending",80));
	return projects;
	
}
public static List<Project>getProjects(){
	return getProjectList();
	
}
public List<String> getProjectPositions(){
	List<String> positions = new ArrayList<>();
	positions.add("Cutting");
	positions.add("Assembl7y");
	positions.add("Packaging");
	return positions;
	
}

public String getProjectDetails() {
	return "Project ID: " + projectId + ", Status: " + status;
}
public void updateProjectStatus(String newStatus) {
	this.status = newStatus; 
}
public int getProjectId() {
	return projectId;
}
public String getStatus() {
	return status; 
}
public int getProducedItems() {
	return producedItems;
}
public void setProducedItems(int producedItems) {
	this.producedItems = producedItems;
}
public int getRequiredItems() {
	return requiredItems;
}
}
