package oopsself;
public class Circlee { 
    public static void main(String[] args){
        Circle c1 = new Circle(140);
        Circle c2 = new Circle(223);
        Circle c3 = c1.clone();

        c1.setR(140);
        System.out.println(c1.getR());
        double Area1=c1.calR();
        System.out.println(Area1);
        c2.setR(223);
        System.out.println(c2.getR());
        double Area2=c2.calR();
        System.out.println(Area2);
        Circle Temp=Circle.large(c1, c2);
        //Temp.setR(10);

        System.out.println("c1:"+c1.calR());
        System.out.println("c2:"+c2.calR());
        System.out.println("Temp:"+Temp.calR());
        System.out.println("c3:"+c3.calR());
    }
}
