package ru.geekbrains.JavaCoreForAndroid;

import java.util.Calendar;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson4
 * Created 07.02.2021
 * v1.0
 */
public class Lesson4 {
    //План действий:
    //Создать класс сотрудник (Staffer)
    // создать в этом классе поля ФИО, должность, email, телефон, зарплата, возраст.
    // по аналогии с данными урока сам возраст хранить не будем, будем сохранять год рождения, а возраст вычислять
    // например сделать тестовый геттер который выводит информацию о возрасте жертвы.
    // создать конструктор со всеми полями
    // создать метод класса выводящий полную информацию о сотруднике (типа toString)
    // в методе main поработать с классом и его объектами:
    // создать 5 объектов класса Staffer, используя конструктор заполнить все поля.
    // создавая эти 5 объектов заполнить ими массив (одномерный)
    // с помощью цикла вывести информацию о сотрудниках старше 40 лет.

    public static void main(String[] args) {
        Staffer[] staffers = new Staffer[5];
        staffers[0] = new Staffer("Петров Петр Петрович",
                "Генеральный директор",
                "petrov@companyname.ru",
                "+7 (981) 123-45-67",
                150000,
                1975);
        staffers[1] = new Staffer("Иванов Иван Иванович",
                "Заместитель генерального директора",
                "ivanov@companyname.ru",
                "+7 (981) 123-45-68",
                120000,
                1982);
        staffers[2] = new Staffer("Васечкин Василий Васильевич",
                "Главный инженер",
                "vasechkin@companyname.ru",
                "+7 (981) 123-45-70",
                100000,
                1972);
        staffers[3] = new Staffer("Кузьмин Кузьма Кузьмич",
                "Начальник производства",
                "petrov@companyname.ru",
                "+7 (981) 123-40-15",
                85000,
                1996);
        staffers[4] = new Staffer("Викторов Виктор Викторович",
                "г/э Сварщик 5разряд",
                null,
                "+7 (981) 137-58-92",
                35000,
                1969);

        int currentYar = Calendar.getInstance().get(Calendar.YEAR);
        int selectionThresholdValue = 40;
        System.out.println("Список сотрудников старше "+ selectionThresholdValue +" лет:");
        for (Staffer staffer : staffers) {
            if (staffer.getYearOfBirth() <= currentYar - selectionThresholdValue) {
                System.out.println(staffer);
            }
        }

    }
}
