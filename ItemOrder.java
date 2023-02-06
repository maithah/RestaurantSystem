public class ItemOrder extends Customers {
    public String item_name;
    public int No_Of_Plates;
    public int price;
    public int Cost;

    public ItemOrder(int Cust_id,String item_name, int No_Of_Plates, int price, int Cost) {
        super(Cust_id);
        this.item_name = item_name;
        this.No_Of_Plates = No_Of_Plates;
        this.price = price;
        this.Cost = Cost;
    }

    public String getItemName() {
        return item_name;
    }

    public int getNumberOfPlates() {
        return No_Of_Plates;
    }

    public int getPrice(){
        return price;
    }

    public int getCost(){
        return price * No_Of_Plates;
    }
    
    @Override
    public String toString(){
        return (super.toString()+ "," +item_name);
    
     }

}