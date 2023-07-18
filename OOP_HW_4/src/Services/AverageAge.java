package Services;

import java.util.List;

import Domen.Person;

public class AverageAge<T extends Person> {
    /**
     * 
     * метод по вычислению среднего возраста экземпляров какого-либо
     * класса-наследника Person
     */
    public double meanAgePerson(List<T> list) {
        double meanAge = 0.0;
        double sum = 0;
        for (T person : list) {

            sum = sum + person.getAge();
        }
        meanAge = sum / list.size();
        return meanAge;
    }
}