import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        items[0] = new NonPerishableItem(1, "Shampoo", 20, 100, 80);
        items[1] = new NonPerishableItem(2, "Soap", 10, 200, 150);
        items[2] = new PerishableItem(3, "Bread", 5, 50, 30, "01-01-2023", "01-03-2023", "Bakery X", 120);
        items[3] = new PerishableItem(4, "Cheese", 15, 75, 55, "01-02-2023", "01-04-2023", "Dairy Y", 50);
        items[4] = new PerishableItem(5, "Milk", 25, 100, 70, "01-01-2023", "01-03-2023", "Dairy Z", 150);
        System.out.println("Welcome to the stock management system");
        System.out.println("1.Employee");
        System.out.println("2.Manager");
        System.out.println("Make a choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            String password;
            System.out.println("Enter employee's password: ");
            password = sc.nextLine();
            if (password.equals("employee")) {
                while (true){
                    Employee employee = new Employee();
                System.out.println("Employee's main Menu");
                System.out.println("1.Check current quantity of individual Items");
                System.out.println("2.Exit System");
                System.out.println("Make a choice: ");
                int c=sc.nextInt();
                switch (c){
                    case 1:employee.checkCurrentQuantity(items);
                    break;
                    case 2:System.exit(0);
                    break;
                    default:System.out.println("Wrong key");
                }
            }}
        } else if (choice == 2) {
            String password;
            while (true){
            Manager manager = new Manager();
            System.out.println("Enter manager's password: ");
            password = sc.nextLine();
            if (password.equals("manager")) {
                while(true){
                    System.out.println("Manager's main Menu");
                    System.out.println("1.List of items to be restock");
                    System.out.println("2.Total number of each individual item that needs to be bought for restock.");
                System.out.println("Make a choice: ");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        manager.checkItemsToRestock(items);
                        break;
                    case 2:
                        manager.restockItems(items);
                        break;
                    default:
                        System.out.println("Wrong key");
                        break;
                }
            }}
        }}
    }
}

