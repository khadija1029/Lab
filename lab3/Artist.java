public class Artist {
    private String name;
    private String nationality;
    private double rating;

    Artist(String name,String nationality, double rating){
        this.name=name;
        this.nationality= nationality;
        this.rating= rating;
    }
    public void setname(String name){
        this.name= name;
    }
    public String getname(){
        return name;
    }
     public void setnationality(String nation){
        this.nationality= nation;
    }
    public String getnationality(){
        return nationality;
    }
     public void setrating(double rate){
        this.rating= rate;
    }
    public double getrating(){
        return rating;
    }
    public String toString(){
        String art= String.format("%-10s   %-10s  %.2f" , name,nationality,rating);
        return art;
    }

    
    }
