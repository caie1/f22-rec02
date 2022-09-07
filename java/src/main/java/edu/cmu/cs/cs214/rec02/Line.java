package edu.cmu.cs.cs214.rec02;

import edu.cmu.cs.cs214.rec02.points.*;

public class Line {
    public Point point1;
    public Point point2;

    Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    void draw() {
        int x1 = point1.computeX();
        int y1 = point1.computeY();
        int x2 = point2.computeX();
        int y2 = point2.computeY();
        
        // assume implementation 

        System.out.println("Line drawn from (" + x1 + ", " + y1 +
                            ") to (" + x2 + ", " + y2 + ")");
    }
}
