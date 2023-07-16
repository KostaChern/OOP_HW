package Domen;

import java.util.Iterator;
import java.util.List;
// класс группы с подключением методов перебора  Iterable и сортировки Comparable
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
  private List<Student> group;// создание поля для группы студентов
  private Integer idGroup; //создаем ID группы
// конструктор группы
  public StudentGroup(List<Student> group, Integer idGroup) {
    this.group = group;
    this.idGroup = idGroup;
  }
// геттер и сеттер для получения и записи данных по группе
  public List<Student> getGroup() {
    return group;
  }

  public void setGroup(List<Student> group) {
    this.group = group;
  }

  public Integer getIdGroup() {
    return idGroup;
  }

  public void setIdGroup(Integer idGroup) {
    this.idGroup = idGroup;
  }
// конструктор вывода на печать данных по группе
  @Override
  public String toString() {
    return "Группа " + idGroup+"(количество студентов - "+this.group.size()+")" + ":" + group;
  }

  @Override
  public Iterator<Student> iterator() {
    return new Iterator<Student>() {

      private int counter;

      @Override
      public boolean hasNext() {

        if (counter < group.size()) {
          return true;
        } else {
          return false;
        }
      }

      @Override
      public Student next() {
        return group.get(counter++);
      }

    };

  }

  // метод для сравнения групп по количеству студентов
  @Override
  public int compareTo(StudentGroup o) {

    if (this.group.size() == o.group.size()) {
      return 0;
    }

    if (this.group.size() > o.group.size())
      return 1;
    else
      return -1;
  }

}