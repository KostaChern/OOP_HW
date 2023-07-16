import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
// Создание первой группы студентов
        Student s1 = new Student("Федор", 23, 134);
        Student s2 = new Student("Милена", 20, 333);
        Student s3 = new Student("Галина", 21, 123);
        Student s4 = new Student("Виолета", 23, 414);
        Student s5 = new Student("Ольга", 25, 109);
        Student s6 = new Student("Марина", 19, 324);
// создаем список первой группы студентов
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        //System.out.println(group4580);

        // for (Student std : group4580) {
        //     System.out.println(std);
        //}

        // создаем новых студентов и новую группу студентов
        Student s7 = new Student("Борис", 28, 2345);
        Student s8 = new Student("Олег", 24, 3019);
        Student s9 = new Student("Николай", 21, 1213);
        Student s10 = new Student("Семен", 23, 4422);
        Student s11 = new Student("Владимир", 25, 2571);
        

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        
        // заполнение группы
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        List<StudentGroup> studentGroups = new ArrayList<StudentGroup>();
        studentGroups.add(group4580);
        studentGroups.add(group4581);

        // новый поток студентов
        StudentSteam steam1 = new StudentSteam(studentGroups, 1);

        //вывести список групп
        for (StudentGroup stm : steam1) {
             System.out.println(stm);
        }

        System.out.println("=========================================================");

        //выводим отсортированные по количеству участников группы
        Collections.sort(steam1.getStudentGroups());

        for (StudentGroup stm : steam1.getStudentGroups()) {
            System.out.println(stm);
        }
    }
}