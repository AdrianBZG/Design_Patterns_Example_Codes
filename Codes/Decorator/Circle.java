/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Concrete class Circle implementing the same interface (Shape)
 */

package es.ull.esit.pai.exposition.Decorator;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Shape: Circle");
  }
}
