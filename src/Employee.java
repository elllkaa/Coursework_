public class Employee {
    private String fIO;
    private int department;
    private float salary;
    private static int counter;
    private final int id;

    public int getId() { return this.id; }
    public String getFIO() { return this.fIO; }
    public int getDepartment() { return this.department; }
    public float getSalary() { return this.salary; }

    public void SetFIO() {this.fIO = fIO; }
    public void SetDepartment() {this.department = department; }
    public void SetSalary() {this.salary = salary;}

    public Employee(String fIO, int department, float salary) {
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + fIO + " Dept: " + department + " Salary: " + salary;
    }
    public String toStringFio () {
        return "Ф.И.О" + fIO;
    }
    

