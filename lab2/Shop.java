
public class Shop {
    public static void main(String[] args) {

       
    Productt p1= new Productt("LCD", 5, 50,new Mandate(7, 3, 2003));
    Productt p2= new Productt("Keboard",7,10,new Mandate(8, 04, 2005));
    Productt p3= new Productt("Keboard wireless",4,10,new Mandate(5, 02,2023));
        p3.setName("mouse");
        p1.setdate(new Mandate(2, 8, 2004));
        

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println(p1.Latest(p1,p2)) ;
    }
}
