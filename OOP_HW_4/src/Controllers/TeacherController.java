package Controllers;

import java.util.List;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    // Метод регистрации преподавателя в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
    }

    /**
     * 
     * метод по выводу на консоль списка преподавателей, находящихся на пенсии
     */
    public void pensionAge(List<Teacher> teachers) {
        int pensionAge = 60;
        System.out.println("Перечень преподавателей, находящихся на пенсии: ");
        for (Teacher teacher : teachers) {
            if (teacher.getAge() >= pensionAge) {
                System.out.println("Преподаватель " + teacher.toStringTo() + " находится на пенсии (возраст: "
                        + teacher.getAge() + " лет)");
            }
        }
    }

}