package lesson7.home;

import lesson5.home.TasksOfString;

import java.util.*;

public class TasksOfCollection {
    public static void main(String[] args) {
        task1();
        task2AndTask3();
        task4();
    }


    //1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
    //List< Book > list = new LinkedList< Book >();
    //Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.

    private static void task1() {
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

    private static void task2AndTask3() {
        System.out.println("2) Весь HashSet<Book> :");
        Set<Book> books = new HashSet<>();
        String nameClone = RandomString.getRandomString(5);
        String authorNameClone = RandomString.getRandomString(5);
        String authorSurNameClone = RandomString.getRandomString(5);
        String authorPatronymicClone = RandomString.getRandomString(5);

        // добавляем 25 ссылок на Book
        for (int i = 0; i < 25; i++) {
            //6 одинаковых
            if (i < 6) {
                books.add(new Book(nameClone, authorNameClone, authorSurNameClone, authorPatronymicClone));
            } else {
                books.add(new Book(RandomString.getRandomString(5),
                        RandomString.getRandomString(5),
                        RandomString.getRandomString(5),
                        RandomString.getRandomString(5)));
            }
        }

        System.out.println(books.size() + " элементов");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Книги, название которых начинается с гласной буквы:");
        for (Book book : books) {
            if (TasksOfString.isVowel(book.getName().charAt(0))){
                System.out.println(book);
            }
        }

        //3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги).
        // Для сотрировки по фамилии создадим TreeSet добавим в него HashSet с компароторам по getAuthorSurName.
        System.out.println("3) Коллекция отсортирована по фамилии автора :");
        Set<Book> booksTree = new TreeSet<>(Comparator.comparing(Book::getAuthorSurName));
        booksTree.addAll(books);
        for (Book book : booksTree) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Коллекция отсортирована по имени автора :");
        booksTree = new TreeSet<>(Comparator.comparing(Book::getAuthorName));
        booksTree.addAll(books);
        for (Book book : booksTree) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Коллекция отсортирована по отчеству автора :");
        booksTree = new TreeSet<>(Comparator.comparing(Book::getAuthorPatronymic));
        booksTree.addAll(books);
        for (Book book : booksTree) {
            System.out.println(book);
        }

    }


    //4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
    //Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
    private static void task4() {
        Student student1 = new Student("Павел","Швед",29);
        Student student2 = new Student("Ольга","Мигалевич",31);
        Student student3 = new Student("Татьяна","Романовская",29);
        Student student4 = new Student("Анна","Шеин",29);
        Student student5 = new Student("Вячеслав","Калевич",23);

        Set<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("4) Все студенты:");
        for (Student student : students) {
            System.out.println(student);
        }

        List<Student> studentsForDelete = new ArrayList<>();
        System.out.println("Все чётные студенты:");
        int i = 1;
        for (Student student : students) {
            if (i % 2 == 0){
                // четных студентов выводим на экран
                System.out.println(student);
            }else {
                // нечетных собираем в лист для удаления
                studentsForDelete.add(student);
            }
            i++;
        }
        // удаляем нечетных студентов
        for (Student studentDel : studentsForDelete) {
            students.remove(studentDel);
        }

    }

    //5. Создать экземпляр класса HashMap, разместить в нём следующую информацию:
    //в качестве ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товаров в данной категории.
    //Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров,
    //удалить все категории в которых нет ни одного товара (предусмотреть такие категории при заполнении коллекции)

}

