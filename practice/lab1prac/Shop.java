package oopsself;

public class Shop {
    
    public static void main(String[] args){
        Product p1 = new Product("pen", 010, 02);
        Product p2 = new Product("key", 0100, 01);

        System.out.println(p1);
        System.out.println(p2);

        p1.nonstatmethod();
        Product.statmethod();

    }
}
