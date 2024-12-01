class MyPoint {
    private int x;
    private int y;

    // Default Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set coordinates
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get coordinates
    public int[] getXY() {
        return new int[]{x, y};
    }

    // toString Method
    public String toString() {
        return " ( " + x + ", " + y + " ) ";
    }

    // Distance to another point (specified by coordinates)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance to another point (specified by another MyPoint object)
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Distance to origin
    public double distance() {
        return distance(0, 0);
    }
}

// Test Class
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(3, 4);

        point1.setXY(1, 2);
        System.out.println("Point1 coordinates after setXY: " + point1.getXY()[0] + ", " + point1.getXY()[1]);
        System.out.println("Point2 coordinates: " + point2.toString());
        System.out.println("Distance from Point1 to Point2: " + point1.distance(point2));
        System.out.println("Distance from Point2 to Origin: " + point2.distance());
    }
}
