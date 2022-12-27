package CourseWork1;
/*
    Класс сотрудник
 */
public class Employee {
    private final Integer id; // Id записи
    private String fullName;  // Ф.И.О.
    private Integer  departmentId; // Номер отдела
    private Integer salary; // Зарплата
    private static Integer idCounter = 1; // Счетчик для Id

    public Employee(String fullName, Integer departmentId, Integer salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.salary = salary;
    }
    public Integer getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public Integer getDepartmentId() {
        return departmentId;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setDepartmentId(Integer departmentId){
        this.departmentId = departmentId;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "№ п/п: " + id + ". ФИО сотрудника: " + fullName + ". Отдел №: " + departmentId +
                ". Зарплата: " + salary;
    }
}
