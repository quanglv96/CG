package Extends;

public class Point {
    static float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return this.x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        float[] arrayXY = {getX(), getY()};
        return arrayXY;
    }

    public String toString() {
        return "Tọa độ x,y là: (" + getX() + ", " + getY() + ")";
    }

    public static class MovablePoint extends Point {
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        public MovablePoint() {
        }

        public MovablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getxSpeed() {
            return this.xSpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public float getySpeed() {
            return this.ySpeed;
        }

        public float[] getSpeed() {
            float[] arraySpeed = {getX(), getY()};
            return arraySpeed;
        }
        public float getmoveX(){
            super.setX(super.getX()+getxSpeed());
            super.getX();
            return super.getX();
        }
        public float getmoveY(){
            super.setY(super.getY()+getySpeed());
            super.getY();
            return super.getY();
        }
        public String toString() {
            return "Tọa độ x,y là: (" + getmoveX() + ", " + getmoveY() + ")";
        }
    }

    public static void main(String[] args) {
        Point point=new Point(2,5);
        System.out.println(point.toString());
        MovablePoint movablePoint=new MovablePoint(2,5,4,4);
        System.out.println(movablePoint.toString());
    }
}
