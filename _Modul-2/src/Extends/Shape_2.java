package Extends;

public class Shape_2 {
    public String color = "green";
    public boolean filled = true;

    public Shape_2() {
    }

    public Shape_2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {// get kiểu boolean
        return filled;
    }

    @Override // ghi đè to String()
    public String toString() {
        return "A Shape with color of " + this.getColor() + " and " + this.isFilled();
    }
    public static class Triangle extends Shape_2{
        private double side1=1;
        private double side2=1;
        private double side3=1;
        private Triangle(){
        }
        private Triangle(double side1,double side2,double side3){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
        }
        public void setSide1( double side1){
            this.side1=side1;
        }
        public double getSide1(){
            return this.side1;
        }
        public void setSide2( double side2){
            this.side2=side2;
        }
        public double getSide2(){
            return this.side2;
        }
        public void setSide3( double side3){
            this.side3=side3;
        }
        public double getSide3(){
            return this.side3;
        }
        public double getArea(){
            double p=(getSide1()+getSide2()+getSide3())/2;
            return Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
        }
        public double getPerimeter(){
            return getSide1()+getSide2()+getSide3();
        }
        public String toString(){
            return "Tam giác với 3 canh có độ dài: "+getSide1()+", "+getSide2()+", "+getSide3()+" có diện tích là: "+getArea()+" và chu vi là: "+getPerimeter()+super.toString();
        }
    }

    public static void main(String[] args) {
        //test shape
        Shape_2 shape_2=new Shape_2("red",true);
        System.out.println(shape_2.toString());
        Triangle triangle=new Triangle(2,2,2);
        System.out.println(triangle.toString());
    }
}
