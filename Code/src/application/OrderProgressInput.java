package application;
public class OrderProgressInput {
public String getProjectDetails(Project project) {
return project.getProjectDetails();
}
public int calculateTotal(Order order, int producedItems) {
return order.calculateTotal(producedItems);
}
public void updateProducedItems(Order order, int producedItems) {
order.updateProducedItems(producedItems);
}
public boolean checkOrderCompletion(Order order) {
return order.checkOrderCompletion();
}
public void updateProjectStatus(Project project, String status) {
project.updateProjectStatus(status);
}
public void updateOrderStatus(Order order) {
order.updateOrderStatus();
}
public void completionMessage() {
OrderCompletedMessage message = new OrderCompletedMessage();
message.completionMessage();
}
public void submitProducedItems(Project project, Order order, int producedItems) {
updateProducedItems(order, producedItems);
updateOrderStatus(order);
if (checkOrderCompletion(order)) {
updateProjectStatus(project, "Completed");
completionMessage();
}
}
}