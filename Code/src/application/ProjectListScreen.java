package application;

import java.util.List;

public class ProjectListScreen {

public void showProjectList() {
List<Project> projects = Project.getProjects();

for (Project project : projects) {
System.out.println(project.getProjectDetails());
}
}

public Project chooseProject(int projectId) {
List<Project> projects = Project.getProjects();

for (Project project : projects) {
if (project.getProjectId() == projectId) {
return project;
}
}

return null;
}

public void progressInput() {
System.out.println("Open order progress input screen");
}
}