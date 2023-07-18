import java.util.ArrayList;
import java.util.List;
import Controllers.TeacherController;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;
import Services.AverageAge;
import Services.StudentService;
import Services.TeacherService;

public class App {
    public static <T> void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 101);
        Student s2 = new Student("Игорь", 23, 102);
        Student s3 = new Student("Максим", 22, 103);
        Student s4 = new Student("Леонид", 20, 104);

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Александр Квитко", 67, "Доцент");
        Teacher t2 = new Teacher("Василий Радов", 65, "Профессор");
        Teacher t3 = new Teacher("Анна Симонова", 37, "Старший преподаватель");
        Teacher t4 = new Teacher("Мария Клековкина", 43, "Доцент");

        List<Teacher> teacherList = new ArrayList<Teacher>();

        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);
        teacherList.add(t4);

        System.out.println("Неотсортированный список преподавателей:");

        for (Teacher teacher : teacherList) 
        {
            System.out.println(teacher);
        }
        System.out.println("==============================================");
        System.out.println("Отсортированный список преподавателей:");
        TeacherService teacherService = new TeacherService();
        teacherService.getAllTeacher(teacherList);

        System.out.println("==============================================");

        System.out.println("Неотсортированный список студентов:");

        for (Student student : studentList) 
        {
            System.out.println(student);
        }
        System.out.println("==============================================");
        System.out.println("Отсортированный список студентов:");
        StudentService studentService = new StudentService();
        studentService.getAllStudent(studentList);
        System.out.println("==============================================");

        //Реализация обощения для класса Teacher
        AverageAge <Teacher> aveTeacher = new AverageAge<Teacher>();
        System.out.println("Средний возраст учителя: " + aveTeacher.meanAgePerson(teacherList) + " лет");
        aveTeacher.meanAgePerson(teacherList);

        //Реализация обощения для класса Student
        AverageAge <Student> aveStudent = new AverageAge<Student>();
        System.out.println("Средний возраст студента: " + aveStudent.meanAgePerson(studentList) + " лет");
        aveStudent.meanAgePerson(studentList);

        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        TeacherController controller = new TeacherController();
        controller.create("Эдуард", 40);

        System.out.println("==============================================");

        controller.pensionAge(teacherList);
        

        

    }
}