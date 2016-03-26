/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description StudentView class, this is the view.
 */

package es.ull.esit.pai.exposition.MVC;

public class StudentView {
  public void printStudentDetails(String studentName, Integer studentNumber) {
    System.out.println("Student: ");
    System.out.println("Name: " + studentName);
    System.out.println("Number: " + studentNumber);
  }
}