package application;

public class Order {
private int orderId;
private int requiredItems;
private int producedItems;
private String status;

public Order() {
}

public Order(int orderId, int requiredItems) {
this.orderId = orderId;
this.requiredItems = requiredItems;
this.producedItems = 0;
this.status = "In Progress";
}

public int calculateTotal(int newProducedItems) {
return producedItems + newProducedItems;
}

public void updateProducedItems(int newProducedItems) {
this.producedItems = calculateTotal(newProducedItems);
}

public boolean checkOrderCompletion() {
return producedItems >= requiredItems;
}

public void updateOrderStatus() {
if (checkOrderCompletion()) {
status = "Completed";
} else {
status = "In Progress";
}
}

public int getOrderId() {
return orderId;
}

public int getRequiredItems() {
return requiredItems;
}

public int getProducedItems() {
return producedItems;
}

public String getStatus() {
return status;
}
}