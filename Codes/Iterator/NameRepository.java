/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Concrete class implementing the Contaner interface. This
 * class has inner class NameIterator implementing the Iterator interface.
 */

package es.ull.esit.pai.exposition.Iterator;

public class NameRepository implements Container {
  private String names[] = { "Adrián", "Rudolf", "Chuchu", "Tutu" };
  
  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }
  
  private class NameIterator implements Iterator {
    int index;
    
    @Override
    public boolean hasNext() {
      if(index < names.length) {
        return true;
      }
      return false;
    }
    
    @Override
    public Object next() {
      if(hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
}