/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Concrete class Rectangle implementing the same interface (Shape)
 */

package es.ull.esit.pai.exposition.Decorator;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Shape: Rectangle");
  }
}
