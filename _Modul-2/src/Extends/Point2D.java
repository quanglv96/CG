package Extends;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D(){}
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x){
        this.x =x;
    }
    public  float getX(){
        return this.x;
    }
    public void setY(float y){
        this.y =y;
    }
    public  float getY(){
        return this.y;
    }
    public float[] getXY(){
        float[] arrayFloatXY={getX(),getY()};
        return arrayFloatXY;
    }
    public String toString(){
        return "2D có tọa độ là ("+getX()+", "+getY()+")";
    }
    public static class Point3D extends Point2D{
         private float z=0.0f;
         public Point3D(){}
        public Point3D(float z){
             this.z=z;
        }
        public  Point3D(float x,float y,float z){
             super(x,y);
             this.z=z;
        }
        public void setZ(float z){
            this.z =z;
        }
        public  float getZ(){
            return this.z;
        }
        public float[] getXYZ() {
            float[] arrayFloatXYZ = {getX(), getY()};
            return arrayFloatXYZ;
        }
        public String toString(){
            return "3D có tọa độ là ("+getX()+", "+getY()+", "+getZ()+")";
        }
    }

    public static void main(String[] args) {
        //test 2D
        Point2D point2D=new Point2D(1,2);
        System.out.println(point2D.toString());
        //test 3D
        Point3D point3D=new Point3D(1,2,3);
        System.out.println(point3D.toString());
    }
}

