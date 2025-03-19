//ECHO is on.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 70000));

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
