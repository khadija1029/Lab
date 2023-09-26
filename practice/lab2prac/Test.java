package oopsself.lab2prac;

public class Test {
    public static void main(String[] args){
        Item i1 = new Item("board",500,2,new Date(02,12,2004));
        Item i2 = new Item("key",50,5,new Date(03,02,2004));
        System.out.println(i1.latest(i1, i2));
    }
    
}
