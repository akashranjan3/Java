package akash.designPattern.creation.prototype.copyConstructor;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("india","up",123,"raipur");
        
        Employee employee = new Employee("akve", "akash",address);
        Employee employee2 = new Employee(employee);
        
        employee2.setName("raja");
        employee2.getAddress().setCity("kolkata");
        
        System.out.println(employee);
        System.out.println(employee2);




    }
}
