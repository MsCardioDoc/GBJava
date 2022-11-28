package Lesson5;

public class Person {

    public String name;

    public int age;

    public String appointment;

    public String email;
    public int tellNumber;
    public float salary;

    public Person(String name, int age, String appointment, int tellNumber, String email, int salary) {
        this.name = name;
        this.age = age;
        this.appointment = appointment;
        this.tellNumber = tellNumber;
        this.email = email;
        this.salary = salary;
    }

    public static void main(String[] args) {


        Person[] persArray = new Person[5];
        persArray[0] = new Person("Лука", 21, "Святой-Никитич", 8988, "svyat@mail.ru", 1);
        persArray[1] = new Person("Хомяк", 43, "Грызун", 8999, "Homa@mail.ru", 4000);
        persArray[2] = new Person("Андрей", 31, "Сисядмин", 8988, "sisya@mail.ru", 65);
        persArray[3] = new Person("Патиш", 30, "Кись-конструктор", 1288, "sisi@mail.ru", 1000000);
        persArray[4] = new Person("Кукулькан", 567, "Президент Талокана", 1268, "talokan@mail.ru", 10000009);

        for (Person person : persArray) {
            if (person.age > 40) {
                person.printInfo();
                System.out.println();
            }
        }

    }


    public void printInfo() {
        System.out.printf("Имя сотрудника: %s%n", this.name);
        System.out.printf("Возраст сотрудника: %s%n", this.age);
        System.out.printf("Должность сотрудника: %s%n", this.appointment);
        System.out.printf("Номер телефона сотрудника: %s%n", this.tellNumber);
        System.out.printf("email сотрудника: %s%n", this.email);
        System.out.printf("Заработная плата сотрудника: %s%n", this.salary);
    }


//    public String getName() {
//        return this.name;
//    }
//    public int getAge() {
//        return this.age;
//    }
//    public String getAppointment() {
//        return this.appointment;
//    }
//    public int getTellNumber() {
//        return this.tellNumber;
//    }
//    public String getEmail() {
//        return this.email;
//    }
//    public int getSalary() {
//        return this.salary;
//    }


}
