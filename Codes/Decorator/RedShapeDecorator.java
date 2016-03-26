/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Concrete decorator class extending the ShapeDecorator class
 */

package es.ull.esit.pai.exposition.Decorator;

public class RedShapeDecorator extends ShapeDecorator {
  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }
  
  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder(decoratedShape);
  }
  
  private void setRedBorder(Shape decoratedShape) {
    System.out.println("Border Color: Red");
  }
}
