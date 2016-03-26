/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Factory to generate objects of concrete class based on
 * given information
 */

package es.ull.esit.pai.exposition.FactoryMethod;

public class ShapeFactory {
  // Use getShape method to get object of type shape
  public Shape getShape(String shapeType) {
    if(shapeType == null) {                               // Its nothing
      return null;
    }
    if(shapeType.equalsIgnoreCase("CIRCLE")) {            // Its a Circle
      return new Circle();
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {  // Its a Rectangle
      return new Rectangle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")) {     // Its a Square
      return new Square();
    }
    
    return null;                                          // Unknown type
  }
}
