package ro.siit;

import java.util.Objects;

public class Triangle implements Shape {

    private double a,b,c;

    public Triangle( double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }





    @Override
    public double getArea() {
        double semiPerimeter = this.getPerimeter()/2;
        return Math.sqrt(semiPerimeter*
                (semiPerimeter - a)*
                (semiPerimeter - b)*
                (semiPerimeter - c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
//mai jos prin Equas implementam definitia a doua triunghiuri egale
    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
