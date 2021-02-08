package ru.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 *
 * HomeWork for lesson4
 * Created 07.02.2021
 * v1.0
 */
public class Staffer {
    private String fio;             //Фамилия Имя Отчество сотрудника
    private String position;        //Должность занимаемая сотрудником в компании
    private String email;           //Адрес электронной почты
    private String phone;           //Номер телефона для связи
    private int wages;              //Размер заработной платы руб./мес.
    private int YearOfBirth;        //дата рождения (Год)

    public Staffer(String fio, String position, String email, String phone, int wages, int yearOfBirth) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.YearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Сотрудник // " +
                "ФИО: '" + fio + '\'' +
                ", должность: '" + position + '\'' +
                ", email: '" + (email==null ? "отсутствует" : email) + '\'' +
                ", телефон: '" + phone + '\'' +
                ", оклад: " + wages + " руб./мес." +
                ", год рождения: " + YearOfBirth;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }
}
