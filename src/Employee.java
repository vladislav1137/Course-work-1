public class Employee {
    private static long idCounter = 0;
    private final long id;
   private String fullName;
  private int departament;
  private double salary;
public Employee(){
    this.id = idCounter++;
}
    public Employee(String fullName, int departament, double salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = idCounter++;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
    return String.format("ID = %s, ФИО - %s, Отдел = %s, Зарплата = %s", id, fullName, departament, salary);
    }
}
