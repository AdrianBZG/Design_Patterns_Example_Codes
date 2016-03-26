/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Main class to use the NameRepository class to get iterator and
 * print names.
 */

package es.ull.esit.pai.exposition.Iterator;

public class Main {
  public static void main(String[] args) {
    NameRepository namesRepository = new NameRepository();
    
    for(Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
      String name = (String)iter.next();
      System.out.println("Name: " + name);
    }
  }
}
