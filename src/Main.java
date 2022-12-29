public class Main {
    public static void main(String[] args) {
    }
    private static Employee[] employees = {
            new Employee("Смирнов Олег Николаевич", 15000, 1),
            new Employee("Цветков Николай Иванович", 25000, 2),
            new Employee("Кузнецов Иван Олегович", 33000, 3),
            new Employee("Михайлов Михаил Михайлович", 15000, 1),
            new Employee("Иванов Иван Иванович", 35000, 2),
            new Employee("Смирнова Анна Дмитриевна", 15000, 1),
            new Employee("Васильева Ольга Олеговна", 25000, 2),
            new Employee("Голубев Иван Константинович", 33000, 1),
            new Employee("Соколов Дмитрий Васильевич", 15000, 3),
            new Employee("Жуков Илья Евгеньевич", 35000, 3)
    };
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static double calculateAverageSalary() {
        return calculateTotalSalary() / (double) employees.length;
    }

    public static void getFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}