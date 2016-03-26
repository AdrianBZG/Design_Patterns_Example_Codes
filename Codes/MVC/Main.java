/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Main class to use the StudentController methods to demonstrate MVC
 * design pattern usage.
 */

package es.ull.esit.pai.exposition.MVC;

public class Main {
  public static void main(String[] args) {
    // Fetch student record based on his number from the database
    Student model = retrieveStudentFromDatabase();
    
    // Create a view : to write student details on console
    StudentView view = new StudentView();
    
    StudentController controller = new StudentController(model, view);
    
    controller.updateView();
    
    // Update model data
    controller.setStudentName("Rudolf");
    
    controller.updateView();
  }
  
  private static Student retrieveStudentFromDatabase() {
    Student student = new Student();
    student.setName("Adrián");
    student.setNumber(1);
    return student;
  }
}
