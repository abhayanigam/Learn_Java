//Interface in Java

import java.lang.Math;

interface Polygon{
    void getArea();

    //calculate the perimeter of a polygon
    default void getPerimeter (int... sides){
        int perimeter = 0;
        for (int side : sides){
            perimeter += side;
        }
        System.out.println("Perimeter : "+perimeter);
    }
}

class Triangle implements Polygon {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

public class Interface {
    public static void main(String[] args) {
        Triangle obj = new Triangle(2,3,4);

        // calls the method of the triangle class
        obj.getArea();

        // calls the method of polygon
        obj.getPerimeter(2,3,5);
    }
}
