/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description This class creates a Square and is able to draw() it
 */

package es.ull.esit.pai.exposition.FactoryMethod;

public class Square implements Shape {
  /**
   * Overriding draw() method from the implemented Shape interface
   */
  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
