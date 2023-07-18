package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
  private int idSteam;
  private List<StudentGroup> studentGroups;

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

      @Override
      public boolean hasNext() {

        if (counter < studentGroups.size()) {
          return true;
        } else {
          return false;
        }
      }

      @Override
      public StudentGroup next() {
        return studentGroups.get(counter++);
      }
    };

  }
}