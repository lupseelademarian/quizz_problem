package ro.siit;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI* radius;
    }
//folosim equals ca sa verificam ce inseamna ca doua cercuri sunt egale
    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
