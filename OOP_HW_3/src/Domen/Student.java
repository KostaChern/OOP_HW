package Domen;

public class Student extends Person implements Comparable<Student> {

  private int id;
// создание конструктора для студента
  public Student(String name, int age, int id) {
    super(name, age); //вызов полей конструктора родителя
    this.id = id; // создание ID в этом конструкторе
  }
// геттеры и сеттеры для получения значений и создания места хранения
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
// конструктор для вывода на печать
  @Override
  public String toString() {
    return "[" + super.getName() + ", " + " возраст: " + super.getAge() + ", id=" + id + "]";
  }
// метод сортировки студенов по возрасту и ID
  @Override
  public int compareTo(Student o) {

    System.out.println(super.getName() + " - " + o.getName());
    if (super.getAge() == o.getAge()) {
      if (id == o.id)
        return 0;
      if (id > o.id)
        return 1;
      else
        return -1;
     
    }

    if (super.getAge() > o.getAge())
      return 1;
    else
      return -1;
  }

}