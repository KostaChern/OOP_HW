package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;

    private String acadDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    public int getCount() {
        return count;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * 
     * метод по созданию экземпляра класса
     */
    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, acadDegree);
        count++;
        teachers.add(per);
    }

    /**
     * 
     * метод по выводу на консоль всех преподавателей
     */
    public void getAllTeacher(List<Teacher> teachers) {
        Collections.sort(teachers);

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

}