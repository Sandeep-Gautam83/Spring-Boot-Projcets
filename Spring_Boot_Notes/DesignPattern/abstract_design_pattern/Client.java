public class Client {
    public static void main(String[] args) {
        
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee1.name();

        Employee employee2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        employee2.name();

        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee3.name();
    }
}
