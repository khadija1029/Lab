class Productt {
    private int Id;
    private String name;
    private double price;
    private int quantity;
    static int counter=1;
    Mandate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setdate(Mandate date) {
        this.date = date;
    }
     public Mandate getdate() {
        return date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

Productt(String name,int quantity,double price,Mandate date){
    this.name= name;
    this.price=price;
    this.quantity=quantity;
    this.Id=counter++;
    this.date=date;

}

public String toString(){
    String PDetails = String.format("%2d\t %-20s\t %4d\t %.2f\t %-10s",Id,name,quantity,price,date);
    return PDetails;
}
public Productt Latest(Productt p1,Productt p2){
    Mandate temp = date.recentp(p1.date,p2.date);
    return temp == p1.date?p1:p2;
    }
}

