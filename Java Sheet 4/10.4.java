import java.util.Scanner;
public class Main {
    static class MyPoint {
        private double x;
        private double y;
        public MyPoint() {x= 0; y = 0;}
        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {return this.x;}
        public double getY() {return this.y;}
        public double distance(MyPoint p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) +
                    Math.pow(this.y - p.y, 2));
        }
        public static double distance(MyPoint p1, MyPoint p2) {
            return Math.sqrt(Math.pow(p1.x - p2.x, 2) +
                    Math.pow(p1.y - p2.y, 2));
        }
        public double distance(double x, double y) {
            return Math.sqrt(Math.pow(this.x - x, 2) +
                    Math.pow(this.y - y, 2));
        }
    }
    public static void main(String[] args) {


        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Distance from p1 to p2 = " + p1.distance(p2));
        System.out.println("Static distance = " + MyPoint.distance(p1, p2));

    }
}
