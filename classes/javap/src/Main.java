package src;

public class Main {

    public static void main(String[] args) {
        Faculty[] faculties;
        Institute[] fknInstitutes;

        // Создание факультета и университета
        University university = new University("VSU");
        Faculty fkn = new Faculty("FKN", "7");
        university.setFaculty(fkn);
        System.out.println("Создание факультета и университета успешно");

        // Создание кафедр
        Institute toizi = new Institute("ТОиЗИ", "10");
        Institute is = new Institute("ИС", "56");
        Institute itu = new Institute("ИТУ", "79");
        Institute piit = new Institute("ПиИТ", "67");
        System.out.println("Создание кафедр успешно");

        // Создание работников
        Lecturer testLecturer = new Lecturer(3, "Лектор 3", "em@ya.ru", fkn);
        piit.setEmploees(new AdministrativePerson(1, "Администратор 1", "adm@mail.ru"), new ResearchPerson(2, "Научный сотрудник 1", "example@a.com", fkn), testLecturer);
        System.out.println("Создание работников успешно");

        // Добавление кафедр
        fkn.setInstitute(toizi, is, itu, piit);
        System.out.println("Добавление кафедр успешно");

        // Запись студента на курс и создание курса
        Student testStudent = new Student("Студент 1", 1, fkn);
        testLecturer.createCourse("Новый курс", 2);
        testStudent.takePartInCourse(fkn.courses.get(0));
        System.out.println("Запись студента на курс и создание курса успешно");
    }
}
