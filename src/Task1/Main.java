package Task1;


public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Andrei",20,"IT");
        employee.showEmployeeDetails();
        employee.setName("Ion");
        employee.setAge(50);
        employee.setDepartment("HR");
        employee.showEmployeeDetails();

    }
}
