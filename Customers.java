public class Customers implements Restaurant{

    protected int Cust_id;
    protected String Name;
    protected String Address;
    protected Long Phone;

    public Customers(int Cust_id){
        this.Cust_id=Cust_id;
    }
    public Customers(int Cust_id,String Name, String Address, Long Phone)
    {
        this.Cust_id=Cust_id;
        this.Name=Name;
        this.Address=Address;
        this.Phone=Phone;
    }
    public int getCustId()
    {
        return Cust_id;
    }
    public String getName()
    {
        return Name;
    }
    public String getAddress()
    {
        return Address;
    }
    public Long getPhone()
    {
        return Phone;
    }
    public String toString(){
        return ("cust_info " +Cust_id+ ", " +Name+ ", "+Address+ "," +Phone);
    }
}