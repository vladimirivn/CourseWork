package CourseWork1;

import static CourseWork1.CourseWork1.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------- Базовая сложность ---------------------");
        printEmployees(); // Печать списка сотрудников
        System.out.println("Сумма затрат на зарплаты в месяц - " + totalSalaryCalculation()); // Сумма затрат на зарплаты в месяц
        System.out.println("Сотрудник с минимальной зарплатой - " + minimalSalaryEmployee()); // Поиск минимальной зарплаты
        System.out.println("Сотрудник с максимальной зарплатой - " + maximalSalaryEmployee()); // Поиск максимальной зарплаты
        System.out.println("Средняя зарплата - " + averageSalary()); // Средняя зарплата
        printFullNameEmployees(); // Печать списка сотрудников

        System.out.println("---------------- Повышенная сложность ---------------------");

        salaryIndexation(10); // Индексация зарплаты
        System.out.println(minimalSalaryEmployeeDepartment(2)); // Минимальная ЗП у сотрудника в отдела
        System.out.println(maximalSalaryEmployeeDepartment(2)); // Максимальная ЗП у сотрудника в отделе
        System.out.println(totalSalaryCalculationDepartment(2)); // Сумма затрат на ЗП по отделу
        System.out.println(averageSalaryDepartment(2)); // Средняя зарплата по отделу
        salaryIndexationDepartment(2, 10); //
        printEmployeeDepartment(2);
        printEmployeesWithSalaryLessThan(35000);
        printEmployeesWithSalaryMoreThan(35000);

    }
    public static final Employee[] employees = {
            new Employee("Александров Сергей Петрович", 1,55011),
            new Employee("Гай Сергей Сергеевич", 1, 60000),
            new Employee("Пименов Юрий Валентинович", 2, 90000),
            new Employee("Кузьменко Евгений Петрович", 2, 35000),
            new Employee("Шахин Максим Георгиевич", 3, 45000),
            new Employee("Шахин Иван Георгиевич", 3, 47000),
            new Employee("Иванов Дмитрий Юрьевич", 4, 25000),
            new Employee("Сидоров Сидор Сидорович", 4, 25500),
            new Employee("Крупинин Ануфрий Федорович", 5, 55000),
            new Employee("Гримм Джек Лондович", 5, 75500),
    };
}
