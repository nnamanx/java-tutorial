package homework5;

import java.lang.Math;

public class PerimeterAndAreaOfCircle {
    int r;
    final double PI = 3.14;

    double perimeter(int r) {
        return (2 * PI * r);
    }

    double area(int r) {
        return (PI * Math.pow(r, 2));
    }
}
