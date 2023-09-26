package oopsself;

class Product {
    private int Id;
    private int quantity;
    private String name;
    private double price;
    static int counter;

    public void setname(String N ){
        name = N;
    }
    public String getname(){
        return name;
    }
    public void setquan(int Q ){
        quantity = Q;
    }
    public int getquan(){
        return quantity;
    }
    public void setprice(double P){
        price = P;
    }
    public double getprice(){
        return price;
    }

    Product(String name,double price,int quantity){
        this.Id= counter++;
        this.name = name;
        this.price = price;
        this.quantity= quantity;
    }
    //public String toString(){
      //  String Pdetails=String.format("%d\t %s\t %f\t %d",Id,name,price,quantity);
      //  return Pdetails;
   // }
   public String toString(){
    return Id +" "+ name + " " + price +" "+quantity;
   }

static{
    System.out.println("khadija ali khan ");
}
static{
    System.out.println("xyz");
}
public void nonstatmethod(){
    System.out.println("non static called");
}
public static void statmethod(){
    System.out.println("static method called");
}




    
}
