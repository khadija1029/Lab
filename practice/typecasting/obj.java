class Student{
    String name;
    double Id;
}
public class obj {
     public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = ("khan2");
        String i = (String)std1.name;
        System.out.println(i);
        std1.Id=5.5;
        int id=(int)std1.Id;
        System.out.println(id);

     }
    
}
