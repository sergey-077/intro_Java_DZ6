package files;

//import java.util.Arrays;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * 1. ФИО,
 * 2. номер читательского билета,
 * 3. факультет,
 * 4. дата рождения,
 * 5. телефон.
 * 6. Методы (экземпляра, без слова static) takeBook(), returnBook().
 * 7. Разработать программу, в которой создается массив объектов данного класса.
 * 8. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг.
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь,
 * Энциклопедия".
 * - takeBook, который будет принимать переменное количество (Тип...
 * parameterName) объектов класса Book
 * (создать новый класс, содержащий имя и автора книги).
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь,
 * Энциклопедия".
 * 9. Аналогичным образом перегрузить метод returnBook().
 * Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения,
 * Словарь, Энциклопедия".
 * Или "Петров В. В. вернул 3 книги".
 */

public class Main {
    public static void main(String[] args) {
        Books books1 = new Books("Рассказы", "Джек Лондон");
        Books books2 = new Books("Справочник по Математике", "М. Я. Выгодский");
        Books books3 = new Books("Энциклопедия", "Изд. <Мир>");
        Books books4 = new Books("Словарь", "Изд. <Наука>");
        Books books5 = new Books("Приключения Буратино", "Алексей Толстой");

        Reader student1 = new Reader("Иванов И. И.", 0102, "Математика", "10.12.2003", "89001234567\n");
        Reader student2 = new Reader("Петров В. В.", 0125, "Радиотехника", "07.05.2005", "89162234455\n");
        Reader student3 = new Reader("Сидоров С. С.", 0101, "Станкостроение", "25.07.2004", "89032223355\n");

        Reader[] students = new Reader[] { student1, student2, student3 };
        Books[] books = new Books[] { books1, books2, books3, books4, books5 };

        student1.takeBooks(books1);
        student2.takeBooks(3);
        student2.takeBooks(books3.getBookName(), books4.getBookName(), books5.getBookName());
        student3.takeBooks(books2.getBookWriter());

        student2.returnBook(books3, books4, books5);
    }
}
