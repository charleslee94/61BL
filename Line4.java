import java.awt.Point;

public class Line4 {
    
    Point [ ] points;
    
    void printLength ( ) {
        double length;
        length = Math.sqrt ( 23 ) ;
        System.out.println ("Line length is " + length);
    }
    
    void printAngle ( ) {
        double angleInDegrees = Math.atan2 ( 12 , 41 ) * 180.0 / Math.PI;
        System.out.println ("Angle is " + angleInDegrees + " degrees");
    }

    public static void main(String[] args) {
        System.out.println ("testing Line4");
        Line4 myLine = new Line4();
        myLine.points = new Point[2];
        myLine.points[0] = new Point(5, 10);
        // Set myLine to contain a reference to a new line object.
        // Initialize myLine's p1 (element 0 of points) to the point (5, 10),
        // and initialize myLine's p2 (element 1 of points) to the point 
        // (45, 40).
        // Print the line's length, which should be 50.
        // Print the line's angle, which should be around 36.87 degrees.
    }
}
