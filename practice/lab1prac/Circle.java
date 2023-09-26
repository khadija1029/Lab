package oopsself;
class Circle {
    private double radius;

    public void setR(double r){
        radius = r;
    }
    public double getR(){
        return radius;
    }
    public double calR(){
         return Math.PI*radius*radius;
    }
    public static Circle large(Circle c1 ,Circle c2){
        if (c1.radius>c2.radius){
            return c1;
        }else {
                return c2;
        }
    }
    Circle(double radius){
        this.radius = radius;
    }
    public Circle clone(){
        return new Circle(this.radius);
    }
}
