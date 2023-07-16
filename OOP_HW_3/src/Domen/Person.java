package Domen;
// задается поле для некой персоны
public class Person {
    private String name;
    private int age;
    // вызов Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// геттеры, сеттеры (получение значения и запись переменной)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}