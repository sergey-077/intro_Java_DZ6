package files;

import java.util.Arrays;

public class Reader {
    private String fullname;
    private int readercard;
    private String faculty;
    private String birthdate;
    private String phone;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setReadercard(int readercard) {
        this.readercard = readercard;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public int getReadercard() {
        return readercard;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public Reader(String fullname, int readercard, String faculty, String birthdate, String phone) {
        this.fullname = fullname;
        this.readercard = readercard;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phone = phone;
    }

    // Инициализация кол-ва возвращённых книг
    public void returnBook(int book) {
        System.out.printf("%s Вернул в библиотеку %d книги\n", fullname, book);

    }

    // Инициализация названий возвращённых книг
    public void returnBook(Books... nameBoks) {
        System.out.printf("%s Вернул в библиотеку книги: %s\n", fullname, Arrays.toString(nameBoks));
    }

    // Имя автора и название книги
    public void returnBook(String... parameterName) {
        System.out.printf("%s Вернул в библиотеки книги: %s\n", fullname, Arrays.toString(parameterName));
    }

    // Инициализация кол-ва взятых книг
    public void takeBooks(int book) {
        System.out.printf("%s Взял в библиотеке %d книги\n", fullname, book);
    }

    // Инициализация названий взятых книг
    public void takeBooks(Books... nameBoks) {
        System.out.printf("%s Взял в библиотеке книги: %s\n", fullname, Arrays.toString(nameBoks));
    }

    // Имя автора и название книги
    public void takeBooks(String... parameterName) {
        System.out.printf("%s Взял в библиотеке книги: %s\n", fullname, Arrays.toString(parameterName));
    }

    @Override
    public String toString() {
        return "Карточка студента: " +
                "ФИО ='" + fullname + '\'' +
                ", Читательский билет № -" + readercard +
                ", Факультет -'" + faculty + '\'' +
                ", Дата рождения -" + birthdate +
                ", Телефон -'" + phone + '\'' +
                '.';
    }
};
