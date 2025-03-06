package org.example;

public class Point {
     private int x;
   private int y;
   public Point(int x, int y) {
this.x=x;
this.y=y;
   }
   public  int getX() {
       return  x;
   }
   public void setX() {
       this.x=x;
   }
    public  int getY() {
        return  y;
    }
    public void setY() {
        this.y=y;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y); //noktanın (0,0) başlangıç noktasına olan uzaklığı
    }
    public double distance(Point other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
