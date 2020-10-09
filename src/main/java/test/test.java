package test;

import java.util.Scanner;
import java.util.*;

public class test {
    public static class Perimeter {

        public static void main( String args[] ) {
            new Perimeter().execute();
        }

        public double getperimeter( int constant, double pi, double radius ) {
            return (constant * pi * radius);
        }

        public double getperimeter( int sconstant, double length ) {
            return (sconstant * length);
        }

        public double getperimeterRLenghtWidith( int rconstant, double rlength, double widith ) {
            return (rconstant * (rlength + widith));
        }

        public double getperimeter( double base, double height, double hypotenuse ) {
            return (base + height + hypotenuse);
        }

        private void execute() {
            final double pi = Math.PI; //22 / 7;
            final int constant = 2;
            double radius;

            final int sconstant = 4;
            double length;

            final int rconstant = 2;
            double rlength;
            double widith;

            double base;
            double height;
            double hypotenuse;

            Scanner s = new Scanner(System.in);
            System.out.println("Enter The Radius");
            radius = s.nextDouble();
            System.out.println("Enter The Square Length");
            length = s.nextInt();
            System.out.println("Enter The Rectangle Lenght");
            rlength = s.nextInt();
            System.out.println("Ener The Rectangle widith");
            widith = s.nextInt();
            System.out.println("Enter The Triangle Base");
            base = s.nextInt();
            System.out.println("Enter The Triangle height");
            height = s.nextInt();
            System.out.println("Enter The Triangle hypotenuse");
            hypotenuse = s.nextInt();

            System.out.println("Perimeter = " + getperimeter(constant, pi, radius));
            System.out.println("Perimeter = " + getperimeter(sconstant, length));
            System.out.println("Perimeter = " + getperimeterRLenghtWidith(rconstant, rlength, widith));
            System.out.println("Perimeter = " + getperimeter(base, height, hypotenuse));

        }
    }
}

