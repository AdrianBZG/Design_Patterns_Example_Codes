/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Abstract decorator class implementing the Shape interface
 */

package es.ull.esit.pai.exposition.Decorator;

public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;
  
  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }
  
  public void draw() {
    decoratedShape.draw();
  }
}
