package Lesson4;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mail.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.com", "892312313", 50000, 45);
        employees[2] = new Employee("Sidorov Alexey", "Developer", "sidorov@mail.com", "892312314", 60000, 41);
        employees[3] = new Employee("Smirnova Olga", "Designer", "smirnova@mail.com", "892312315", 40000, 35);
        employees[4] = new Employee("Kuznetsov Sergey", "Analyst", "kuznetsov@mail.com", "892312316", 55000, 50);

        System.out.println("Сотрудники старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
