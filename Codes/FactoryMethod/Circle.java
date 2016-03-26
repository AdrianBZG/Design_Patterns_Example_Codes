/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description This class creates a Circle and is able to draw() it
 */

package es.ull.esit.pai.exposition.FactoryMethod;

public class Circle implements Shape {
  /**
   * Overriding draw() method from the implemented Shape interface
   */
  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
