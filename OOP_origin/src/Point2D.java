public class Point2D {
    int x, y;

    public Point2D(int value){
        this(value,value);
    }
    public Point2D() {
        this(0);
    }
    public Point2D (int valueX,int valueY){
        x = valueX;
        y = valueY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
