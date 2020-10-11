package ro.siit;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shapes {
    //Set<Shape> shapes = new HashSet<>();
    List<Shape> shapes = new ArrayList<>();
//folosind List avem putem sa folosim If() de mai jos ca sa aruncam exceptia
    public void addShape(Shape shape) throws Exception  {

        //daca folosim if(...) atunci nu mai avem nevoie de se mai sus, prin metoda set de mai sus exceptia e silent nu o sa mai fie aruncata(evidentiata)
        if(shapes.contains(shape) ){
            throw new Exception("Cannot add similar "+ shape.getClass().getName());
        }
        this.shapes.add(shape);

    }
    public double getTotalPerimeter(){
        /*double sum = 0;
        for (Shape shape: shapes){
        sum += shape.getPerimeter();
        } asta e alternativa la return shape de mai jos
         */

        return shapes.stream().mapToDouble(shapes -> shapes.getPerimeter()).reduce(0, (x,y)-> x+y);

        //reduce e un acumulator, iar identity 0 este pentru adunare, daca era * ar fi fost 1 in loc de 0...o sa aduc=ne de fiecare data tot cate un argument x
        //metoda shape.stream asigura o iterare, e ca un foreach
    }
    public double getTotalArea(){
        return shapes.stream().mapToDouble(shapes -> shapes.getPerimeter()).reduce(0, ( x, y ) -> x + y);

    }
}
