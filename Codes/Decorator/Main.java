/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Main class to use the RedShapeDecorator to decorate Shape objects
 */

package es.ull.esit.pai.exposition.Decorator;

public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle();                                  // Creating a normal Circle
  
    Shape redCircle = new RedShapeDecorator(new Circle());        // Creating a Circle with red border
  
    Shape redRectangle = new RedShapeDecorator(new Rectangle());  // Creating a Rectangle with red border
    
    System.out.println("Circle with normal border");
    circle.draw();          // Drawing the normal circle
    
    System.out.println("\nCircle of red border");
    redCircle.draw();       // Drawing the decorated Circle (with red border)
    
    System.out.println("\nRectangle of red border");
    redRectangle.draw();    // Drawing the decorated Rectangle (with red border)
  }
}
