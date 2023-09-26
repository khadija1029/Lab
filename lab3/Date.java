
public class Date {
    private int mfcdate ; 
    private int month;
    private int year;
    public void setdate(int date){
        this.mfcdate= date;
    }
    public int getdate(){
        return mfcdate;
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
    Date(int mfcdate,int month,int year){
        this.mfcdate=mfcdate;
        this.month = month;
        this.year=year;
    }
       public String toString(){
        String datee= String.format("%d-%d-%d",mfcdate,month,year);
        return datee;
     }
       public static Date recentp(Date d1,Date d2){
         //return d1.getyear()>d2.getyear()?d1:d2;
         if(d1.getyear()>d2.getyear()){
            return d1;
         }
         else if(d1.getyear()<d2.getyear()){
            return d2;
         }
         else if(d1.getyear()==d2.getyear()){
            if(d1.getmonth()>d2.getmonth()){
                return d1;
            }else{
                return d2;
            }
         }
        return d2;
       }
    }

