package ArrayList;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // Добавляем элемент по индексу один

        System.out.println(people.get(1)); // Получаем второй обьект
        people.set(1, "Robert"); //Установка нового значения для 2-го обьекта

        // Проверяем  сколько элементов в List   // 5
        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person: people){
            System.out.println(person);
        }

        // Проверяем на наличие элемента
        if (people.contains("Tom")){
            System.out.println("ArrayList contains Tom");
        }

        // Удаление обьекта
        // Удаление конкретного элемента
        people.remove("Robert");
        // Удаление по ииндексу
        people.remove(0);

        // toArray - преобразовать список в массив объектов
        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray) {

            System.out.println(person);
        }


    }
}
