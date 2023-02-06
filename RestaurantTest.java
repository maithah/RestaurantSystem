import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantTest {
    public static void main(String[] args) {
        Menu menu = new Menu("","","");
        System.out.println(menu.getName());
        System.out.println(menu.getAddress());
        System.out.println(menu.getMenu());


        Scanner in = new Scanner(System.in);
        ArrayList<Customers> cus = new ArrayList<Customers>();
        ArrayList<ItemOrder> it = new ArrayList<ItemOrder>();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("------******RESTAURANT BILLING SYSTEM******------");
        System.out.println("-------------------------------------------------");
        System.out.println("     ---------Enjoy our services!!!---------     ");
        
        int cust = 1;

        while (cust == 1) {

            System.out.println("Enter Customer Id: ");
            int Cust_id = in.nextInt();
            System.out.println("Enter Customer Name: ");
            in.nextLine();
            String Name = in.nextLine();
            System.out.println("Enter Customer Address: ");
            String Address = in.nextLine();
            System.out.println("Enter Customer phone Number:");
            Long Phone = in.nextLong();
            cus.add(new Customers(Cust_id, Name, Address,Phone));

            int itm = 1;

            while (itm == 1) {

                System.out.println("Enter Item Name: ");
                String item_name = in.nextLine();
                in.nextLine();
                System.out.println("Enter number of plates: ");
                int No_Of_Plates = in.nextInt();
                System.out.println("Enter Price: ");
                int price = in.nextInt();
                System.out.println("Cost paid: ");
                int Cost = in.nextInt();
                it.add(new ItemOrder(Cust_id, item_name, No_Of_Plates, price, Cost));
                System.out.println("To continues with selling press 1 or press 2 to exit:");
            
            itm = in.nextInt();
            }

            System.out.println("To continues with services press 1 or 2 to exit:");
            cust = in.nextInt();
        }
        
        for (Customers element : cus) {
            System.out.println(" Customer Id: " + element.getCustId());
            System.out.println(" Customer Name: " + element.getName());
            System.out.println(" Customer Address: " + element.getAddress());
            System.out.println(" Customer Phone: " + element.getPhone());
            System.out.println("-------------------");

            for (ItemOrder element1 : it) {
                if (element.getCustId() == element1.getCustId()) {
                    System.out.println(" Item Name: " + element1.getItemName());
                    System.out.println(" Number of plates: " + element1.getNumberOfPlates());
                    System.out.println(" Item price: " + element1.getPrice());
                    System.out.println("Cost paid: " + element1.getCost());
                    System.out.println("-------------------");
                                       
                }
            }
        }

        Bill bill = new Bill();
        System.out.println();
        System.out.println("**** 1 IN A MILLION RESTAURANT **** ");
        System.out.println("----- RESTAURANT BILL ------");
        bill.getBill();
    }

}