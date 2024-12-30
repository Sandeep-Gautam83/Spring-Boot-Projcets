public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Salary : "+salary);
        
    }
}
