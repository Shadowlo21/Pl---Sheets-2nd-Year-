public class Main {
    static class Circle2D {
        private double x;
        private double y;
        private double radius;
        public Circle2D() {
            this.x = 0;
            this.y = 0;
            this.radius = 1;
        }
        public Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        private double distance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }
        public boolean contains(double px, double py) {
            return distance(this.x, this.y, px, py) < radius;
        }
        public boolean contains(Circle2D c) {
            double centerDistance = distance(this.x, this.y, c.x, c.y);
            return centerDistance + c.radius <= this.radius;
        }
        public boolean overlaps(Circle2D c) {
            double centerDistance = distance(this.x, this.y, c.x, c.y);
            return centerDistance < this.radius + c.radius &&
                    centerDistance + Math.min(this.radius, c.radius) > Math.max(this.radius, c.radius);
        }
    }
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

        System.out.println("c1.contains(3,3) = " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)) = "
                + c1.contains(new Circle2D(4, 5, 10.5)));

        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)) = "
                + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}