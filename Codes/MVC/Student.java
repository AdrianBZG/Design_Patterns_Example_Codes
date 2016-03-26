/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Class Student, this is the model
 */

package es.ull.esit.pai.exposition.MVC;

public class Student {
  private String name;
  private Integer number;
  
  public String getName() {
    return name;
  }
  
  public Integer getNumber() {
    return number;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setNumber(Integer number) {
    this.number = number;
  }  
}
