public class Mandate {
        private int date;
        private int month;
        private int year;
    
    Mandate(int date,int month,int year){
        this.date = date;
        this.month= month;
        this.year = year;
    }
    public void setdate(int date){
        this.date= date;
    }
    public int getdate(){
        return date;
    }
    public void setmonth(int month){
        this.month= month;
    }
    public int getmonth(){
        return month;
    }
    public void setyear(int year){
        this.year= year;
    }
    public int getyear(){
        return year;
    }
       public String toString(){
        String datee= String.format("%d-%d-%d",date,month,year);
        return datee;
     }
       public static Mandate recentp(Mandate d1,Mandate d2){
         return d1.getmonth()<d2.getmonth()?d2:d1;
       }
    }
    
      
