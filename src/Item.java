class Item {
    int ID;
    String name;
    int price;
    int stock_quantity;
    int current_quantity;
    String state;

    Item(int ID, String name, int price, int stock_quantity, int current_quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.current_quantity = current_quantity;
        this.state = "In Stock";
    }

    void restock() {
        this.current_quantity = this.stock_quantity;
    }
}
