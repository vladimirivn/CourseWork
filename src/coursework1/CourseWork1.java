package CourseWork1;

import static CourseWork1.Main.employees;

public class CourseWork1 {
    /*
        private static final Employee[] employees = {
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
    */
/*
    Базовая сложность
*/
    // Печать списка всех сотрудников
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    // Подсчет суммы затрат на зарплаты в месяц
    public static int totalSalaryCalculation() {
        int sum = 0;
        for (Employee employee : employees) {
//            if (employee.getSalary() == null)
//            {
//                employee.setSalary(0);   // проверим зарплату на null
//            }
            sum += employee.getSalary();
        }
        return sum;
    }
    //  Найти сотрудника с минимальной зарплатой.
    public static Employee minimalSalaryEmployee() {

        Employee minSalary = employees[0];
        int min = employees[0].getSalary();

        for (Employee employee : employees)
        {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                minSalary = employee;
            }
        }
        return minSalary;
    }
    // Найти сотрудника с максимальной зарплатой
    public static Employee maximalSalaryEmployee() {

        Employee maxSalary = employees[0];
        int max = employees[0].getSalary();

        for (Employee employee : employees)
        {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    // Подсчитать среднее значение зарплат
    public static float averageSalary() {
        int count = 0;  // Счетчик количества не нулевых зарплат
        for (Employee employee : employees)
        {
            if (employee.getSalary()!=0) {
                count++;
            }
        }
//        return (float) totalSalaryCalculation() / employees.length;
        return (float) totalSalaryCalculation() / count;
    }
    public static void printFullNameEmployees(){
        for (Employee employee : employees)
        {
            System.out.println(employee.getFullName());
        }
    }
    /*
        Повышенная сложность
    */
    // Индексация зарплаты
    public static void salaryIndexation(int percent){
        for (Employee employee : employees)
        {
            int salary = employee.getSalary();
            employee.setSalary((int) (salary * (1 + percent / 100f)));
//            System.out.println(employee.getSalary());
        }
    }
    // Минимальная ЗП у сотрудника в отдела
    public static Employee minimalSalaryEmployeeDepartment(int departmentId) {

        int min = Integer.MAX_VALUE;
        Employee result = null;

        for (Employee employee: employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    // Максимальная ЗП у сотрудника в отделе
    public static Employee maximalSalaryEmployeeDepartment(int departmentId) {

        int max = Integer.MIN_VALUE;
        Employee result = null;

        for (Employee employee: employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    // Сумма затрат на ЗП по отделу
    public static int totalSalaryCalculationDepartment(int departmentId) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    // Средняя зарплата по отделу
    public static float averageSalaryDepartment(int departmentId) {
        int employeeCount = 0; //Счетчик сотрудников в отделе
        int sum = 0; // Сумма зарплат в отделе

        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                sum += employee.getSalary();
                employeeCount++;
            }
        }
        return (float) sum / employeeCount;
    }
    // Индексация зарплаты сотрудникам в отделе
    public static void salaryIndexationDepartment(int departmentId, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                int salary = employee.getSalary();
                employee.setSalary((int) (salary * (1 + percent / 100f)));
                System.out.println(employee.getSalary());
            }
        }
    }
    // Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void printEmployeeDepartment(int departmentId){
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
//                System.out.println(employee);
                System.out.println(employee.getId()+", "+employee.getFullName() + ", " + employee.getSalary()); // В условии -Напечатать всех сотрудников отдела (все данные, кроме отдела)
            }
        }
    }
    // Печать всех сотрудников с зарплатой меньше числа
    public static void printEmployeesWithSalaryLessThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf("Id = %d, Ф.И.О. = %s, Зарплата = %d\n", employee.getId(), employee.getFullName(),employee.getSalary());
            }
        }
    }
    // Печать всех сотрудников с зарплатой больше числа
    public static void printEmployeesWithSalaryMoreThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf("Id = %d, Ф.И.О. = %s, Зарплата = %d\n", employee.getId(), employee.getFullName(),employee.getSalary());
            }
        }
    }
}
