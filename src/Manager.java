class Manager {
    void checkItemsToRestock(Item[] items) {
        System.out.println("Items to restock:");
        for (Item item : items) {
            if (item.state.equals("Need to restock")) {
                System.out.println("Item ID: " + item.ID);
                System.out.println("Item Name: " + item.name);
                System.out.println("Quantity to restock: " + (item.stock_quantity - item.current_quantity));
            }
        }
    }

    void restockItems(Item[] items) {
        for (Item item : items) {
            if (item.state.equals("Need to restock")) {
                item.restock();
            }
        }
    }
}
