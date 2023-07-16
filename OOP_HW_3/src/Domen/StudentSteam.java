package Domen;

import java.util.Iterator;
import java.util.List;
// создание класса студенческого потока с возможностью сравнениия Iterable
public class StudentSteam implements Iterable<StudentGroup> {
  private int idSteam;
  private List<StudentGroup> studentGroups;
// конструктор
  public StudentSteam(List<StudentGroup> studentGroups, int idSteam) {
    this.studentGroups = studentGroups;
    this.idSteam = idSteam;
  }

  public int getIdSteam() {
    return idSteam;
  }

  public void setIdSteam(int idSteam) {
    this.idSteam = idSteam;
  }

  public List<StudentGroup> getStudentGroups() {
    return studentGroups;
  }

  public void setStudentGroups(List<StudentGroup> studentGroups) {
    this.studentGroups = studentGroups;
  }

  @Override
  public String toString() {
    return "StudentSteam [idSteam=" + idSteam + ", studentGroups=" + studentGroups + "]";
  }
//метод для прохождения по группам
  @Override
  public Iterator<StudentGroup> iterator() {
    return new Iterator<StudentGroup>() {

      private int counter;
    //  проверка достижения счетчиком предела (размера группы)
      @Override
      public boolean hasNext() {

        if (counter < studentGroups.size()) {
          return true;
        } else {
          return false;
        }
      }
// возврат группы с добавлением значения в счетчик
      @Override
      public StudentGroup next() {
        return studentGroups.get(counter++);
      }
    };

  }
}