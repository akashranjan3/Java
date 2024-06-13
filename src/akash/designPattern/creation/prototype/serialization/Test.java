package akash.designPattern.creation.prototype.serialization;

import java.io.Serializable;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("india", "up", 123, "raipur");
        Employee employee = new Employee("akve", "akash", address);
//        Employee employee2 = SerializationUtils.roundTrip(employee);
        //not working
        Employee employee2 = employee;


        employee2.setName("raja");
        employee2.getAddress().setCity("kolkata");

        System.out.println(employee);
        System.out.println(employee2);


    }
}
