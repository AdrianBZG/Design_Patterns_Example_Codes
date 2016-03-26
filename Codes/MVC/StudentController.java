/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description StudentController class, this is the controller
 */

package es.ull.esit.pai.exposition.MVC;

public class StudentController {
  private Student model;
  private StudentView view;
  
  public StudentController(Student model, StudentView view) {
    this.model = model;
    this.view = view;
  }
  
  public void setStudentName(String name) {
    model.setName(name);
  }
  
  public String getStudentName() {
    return model.getName();
  }
  
  public void setStudentNumber(Integer number) {
    model.setNumber(number);
  }
  
  public Integer getStudentNumber() {
    return model.getNumber();
  }
  
  public void updateView() {
    view.printStudentDetails(model.getName(), model.getNumber());
  }
}
