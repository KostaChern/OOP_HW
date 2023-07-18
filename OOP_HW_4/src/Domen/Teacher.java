package Domen;

public class Teacher extends Person implements Comparable<Teacher> {
    private String acadDegree;

    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public int compareTo(Teacher o) {
        if (super.getAge() == o.getAge()) {
            return 0;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Преподаватель: " + super.getName() + ", возраст: " + super.getAge() + ", ученая степень (должность): "
                + getAcadDegree();
    }

    /**
     * 
     * дополнительный метод для вывода исключительно имени преподавателя
     */
    public String toStringTo() {
        return super.getName();
    }
}