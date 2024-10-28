// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        //shapes[0] = new Circle(4 , "Circle one");
       // shapes[1] = new Circle(6.7,"Circle two" );
      /*  shapes[2] = new Rectangle(3,4, "Rectangle one");
        shapes[3] = new Rectangle(9,3, "Rectangle two");

       for (Shape shape : shapes){

           System.out.println("area of " + shape.name() + ": " + shape.area());
           System.out.println("perimeter of " + shape.name() + ": " + shape.perimeter());
           System.out.println(" ");


       }*/

        Colour[] colours = new Colour[2];
        colours[0] = new Circle(4 , "Circle one", "red");
        colours[1] = new Circle(6.7,"Circle two" , "blue");


        for(Colour c : colours){
            System.out.println( c.getColor());
        }


        }
    }
