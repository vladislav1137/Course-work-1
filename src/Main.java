import java.util.IdentityHashMap;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
       employees[0] = new Employee("Сергеев Виктор Николаевич", 1, 21_000);
       employees[1] = new Employee("Демьянова Юлия Фёдоровна", 2, 23_000);
       employees[2] = new Employee("Левина Екатерина Васильевна", 2, 22_000);
       employees[3] = new Employee("Крюков Евгений Антонович", 1, 24_000);
       employees[4] = new Employee("Карпова София Сергеевна", 1, 22_500);
       employees[5] = new Employee("Беляева Алисия Петровна", 3, 34_000);
       employees[6] = new Employee("Филатов Артём Александрович", 4, 27_000);
       employees[7] = new Employee("Орлов Богдан Максимович", 5, 24_000);
       employees[8] = new Employee("Морозов Святослав Максимович", 5, 25_000);
       employees[9] = new Employee("Романов Евгений Константинович", 3, 40_000);

     printAll();
        System.out.println("Сумма зарплат = "+getSalarySum());

        Employee employeeWithMinSalary = getEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(getEmployeeWithMinSalary());

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(getEmployeeWithMaxSalary());
        
        System.out.println("Средняя зарплата сотрудника = "+getAverageSalary());
        printAllNames();
    }
    //список всех сотрудников
    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    //сумма затрат на зарплаты в месяц
    private static double getSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //сотрудник с минимальной зарплатой
    private static Employee getEmployeeWithMinSalary() {
        double minSalary = Double.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee employee : employees){
            if (minSalary > employee.getSalary()){
                minSalary = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    //сотрудник с максимальной зарплатой
    private static Employee getEmployeeWithMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        Employee maxEmployee = null;
        for (Employee employee : employees){
            if (maxSalary < employee.getSalary()){
                maxSalary = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    //среднее значение зарплат
    private static double getAverageSalary() {
        double averageSalary = getSalarySum()/ employees.length;
        return averageSalary;
    }

    // Список всех сотрудников
    private static void printAllNames(){
        for (Employee employee:employees){
            System.out.println(employee.getFullName());
        }
    }
}