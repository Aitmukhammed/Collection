package ArrayDeque;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // Получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println("Первый элемент: "+sFirst);

        // Получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println("Последний элемент: "+sLast);

        System.out.println();
        System.out.printf("Queue size: %d \n", states.size()); //5

        while (states.peek() != null){
            // Извлечение с начала
            System.out.println(states.pop());
        }

        // Очередь из обьектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        System.out.println();
        // Перебор без извлечения
        for (Person p : people) {
            System.out.println(p.getName());
        }



    }
}
