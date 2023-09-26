package equals;
class Noise{
    int Id;
    String name;
Noise(int Id,String name){
    this.Id=Id;
    this.name= name;
}
}
public class Equal {
    public static void main(String[] args) {
        Noise n1 = new Noise(12,"hello");
        Noise n2 = new Noise(12, "hello");
        if(n1.Id==n2.Id){
            System.out.println("id are equal");
        }else{
            System.out.println("not equal");
        }
        if(n1.name.equals(n2.name)){
            System.out.println("name are equal");
        }else{
            System.out.println("not equal");
        }
        
    }
    
}
