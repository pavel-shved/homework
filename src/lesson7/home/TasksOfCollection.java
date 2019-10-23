package lesson7.home;

import lesson4.school.Cat;

import java.util.LinkedList;
import java.util.List;

public class TasksOfCollection {
    public static void main(String[] args) {
        task1();
    }

    //1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
    //List< Book > list = new LinkedList< Book >();
    //Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.
    private static void task1(){
        List<Book> books = new LinkedList<>();
        Book book1 = new Book("Муму", "Иван", "Тургенев", "Сергеевич");
        Book book2 = new Book("Капитанская дочка", "Александр", "Пушкин", "Сергеевич");
        Book book3 = new Book("Война и мир", "Лев", "Толстой", "Николаевич");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("1) Информация о всех книгах:");
        for (Book book : books) {
            System.out.println(book);
        }

        //удаляем вторую книгу по индексу
        books.remove(1);
        System.out.println("После удаления второй книги:");
        for (Book book : books) {
            System.out.println(book);
        }

    }


    //2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть не менее 6 одинаковых по значению книг.
    //Вывести на экран информацию о книга (содержащихся в коллекции HashSet), название которых начинается с гласной буквы.

    //3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги).

    //4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
    //Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.

    //5. Создать экземпляр класса HashMap, разместить в нём следующую информацию:
    //в качестве ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товаров в данной категории.
    //Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров,
    //удалить все категории в которых нет ни одного товара (предусмотреть такие категории при заполнении коллекции)
}
