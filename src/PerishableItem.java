class PerishableItem extends Item {
    String manufactured_date;
    String expiry_date;
    String manufactured_by;
    int quantity_sold_last_month;

    PerishableItem(int ID, String name, int price, int stock_quantity, int current_quantity, String manufactured_date, String expiry_date, String manufactured_by, int quantity_sold_last_month) {
        super(ID, name, price, stock_quantity, current_quantity);
        this.manufactured_date = manufactured_date;
        this.expiry_date = expiry_date;
        this.manufactured_by = manufactured_by;
        this.quantity_sold_last_month = quantity_sold_last_month;
    }

    void restock() {
        if (this.quantity_sold_last_month >= 100) {
            super.restock();
        }
    }
}
