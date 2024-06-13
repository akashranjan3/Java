package akash.comparator.ex3;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String jobRole;

    public Employee(int id, String name, String jobRole) {
        this.id = id;
        this.name = name;
        this.jobRole = jobRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(jobRole, employee.jobRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, jobRole);
    }



    @Override
    public int compareTo(Employee o) {
        return this.getName().length()-o.getName().length();
    }

    @Override
    public String toString() {
        return "Employee from ex3 {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}
