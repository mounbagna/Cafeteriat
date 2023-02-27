class Employee {
    void checkCurrentQuantity(Item[] items) {
        for (Item item : items) {
            System.out.println("Item ID: " + item.ID);
            System.out.println("Item Name: " + item.name);
            System.out.println("Current Quantity: " + item.current_quantity);
            System.out.println("State: " + item.state);
            if (item.current_quantity < item.stock_quantity) {
                item.state = "Need to restock";
            }
        }
    }
}
