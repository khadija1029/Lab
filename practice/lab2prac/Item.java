package oopsself.lab2prac;

class Item {
        private int Id;
        private int quantity;
        private String name;
        private double price;
        static int counter;
        private Date mfcdate;
    
        public void setname(String N ){
            name = N;
        }
        public String getname(){
            return name;
        }
        public void setquan(int Q ){
            quantity = Q;
        }
        public int getquan(){
            return quantity;
        }
        public void setprice(double P){
            price = P;
        }
        public double getprice(){
            return price;
        }
        public void setdate(Date d){
            mfcdate = d;
        }
        public Date getdate(){
            return mfcdate;
        }
        Item(String name,double price,int quantity,Date mfcdate){
            this.Id= counter++;
            this.name = name;
            this.price = price;
            this.quantity= quantity;
            this.mfcdate= mfcdate;
        }
        public String toString(){
           String Pdetails=String.format("%d\t %s\t %f\t %d \t%s",Id,name,price,quantity,mfcdate);
            return Pdetails;
       }
       public Item latest(Item i1,Item i2){
        Date Temp = mfcdate.recentp(i1.mfcdate, i2.mfcdate);
        return Temp==i1.mfcdate?i1:i2;
       }
    
}
