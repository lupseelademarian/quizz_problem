package ro.siit;

import org.junit.Assert;
import org.junit.Test;

public class ShapesTest {
    @Test
    public void perimeterSumWorks()throws Exception{
        Shapes shapes = new Shapes();
        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(6, 7, 8);
        //mai sus procedeul de incarcare a oricarui triungi

        shapes.addShape(triangle1);
        shapes.addShape(triangle2);
//Assert mai jos se verifica suma tuturor triungiurilor incarcate

        Assert.assertEquals(34.0,shapes.getTotalPerimeter(),0);

    }
    @Test//(expected =Exception .class)
    //am comentat expresia de mai sus ca sa-mi arunce exceptia, altfel sistemul ar fi asteptat-o
    public void ThrowsExceptionsWhenAddingSimilarShapes()throws Exception{
        Shapes shapes = new Shapes();
      Circle circle1 = new Circle(1);
      Circle circle2 = new Circle(1);

        //mai sus procedeul de incarcare a doua cercuri cu acelasi radius ca sa vedem daca arunca exceptia

        shapes.addShape(circle1);
        shapes.addShape(circle2);

    }
}
