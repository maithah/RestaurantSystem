public class Menu implements Restaurant{
    String Name;
    String Address;
    String Menu;

    public Menu(String Name, String Address, String Menu){
        this.Name = Name;
        this.Address = Address;
        this.Menu = Menu;
    }

    public String getMenu(){
        System.out.println("*****************OUR RESTAURANT MENU*******************");
        System.out.println("ITEM\t\t\t\tPRICE");
        System.out.println("1. Pilau\t\t\t\t1000");
        System.out.println("2. Biriani\t\t\t\t2000");
        System.out.println("3. Mandi\t\t\t\t5000");
        System.out.println("4. Fruit juice\t\t\t\t500");
        System.out.println("5. Fried chicken\t\t\t2500");
        System.out.println("6. Sea foods\t\t\t\t6000");
        System.out.println("7. Chinese rice\t\t\t\t3500");
        System.out.println("8. Soda\t\t\t\t\t1000");
        System.out.println("9. Fruits\t\t\t\t4000");
        return Menu;
    }

    public String getAddress(){
        System.out.println("\t*-*-* 1 IN A MILLION RESTAURANT *-*-* ");
        return Address;
    }

    public String getName(){
        System.out.println("\t\tCHWAKA-ZANZIBAR");
        return Name;
    }

}
