package akash.designPattern.creation.builder.ex1;

public class Employee {
    public static String kutta;
    public static String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional

        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        //Build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC")
                .setHasBike(false)
                .setHasBike(true)
                .build();
        System.out.println(employee);

        employee = new Employee.EmployeeBuilder("ranjan", "nc")
                .setHasBike(false)
                .setHasBike(true)
                .build();
        System.out.println(employee);

        Employee.EmployeeBuilder employeeBuilder = new Employee
                .EmployeeBuilder("akash ", "wal");
        Employee employee1 = employeeBuilder.build();
        System.out.println(employee1);

    }
}