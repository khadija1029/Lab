import java.util.*;
public class Demo {
    public static void main(String[] args) {
        // Music m1 = new Music("khamoshiyan",new Artist("arijit", "indian", 5.5), 3.5, "sad", new Date(02,05, 2004));
        // Music m2 = new Music("banjaara",new Artist("harry", "indian", 6.0), 4.3, "soch", new Date(3, 4, 2023));
        // Music m3 = new Music("khamoshiyan",new Artist("prank", "indian", 8), 5.7, "hindi", new Date(7, 8, 2018)); 
        // Music m4 = new Music("backbone", new Artist("sandhu", "indian", 2), 8,"fastbeat", new Date(7, 9, 2013));
        // Music m5 = new Music("tm_hi_ana",new Artist("arijit", "indian", 9.0), 6, "soch", new Date(3, 8, 2021));
        // Music list[]= new Music[5];
        // list[0] = m1;
        // list[1] =m2;
        // list[2] =m3;
        // list[3] =m4;
        // list[4] =m5;
        // for(int i =0;i<5;i++){
        //     System.out.println(list[i]);
        // }
        // System.out.println(m1);
        // System.out.println(m2);
        // System.out.println(m3);
        // System.out.println(m4);
        // System.out.println(m5);

    //System.out.println(m1.equals(m3));
    //System.out.println("enter any integer!");
    Scanner sc  = new Scanner(System.in);
    // int no1 = sc.nextInt();
    // System.out.println(no1);
    System.out.println("entere artists nsme");
    String nam = sc.nextLine();
    Music m6= new Music("ferf",new Artist(nam, "fer", 5), 2, "fsdf", new Date(5,6, 2034));
    System.out.println(m6);
    }
    
}
