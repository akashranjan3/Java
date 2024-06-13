package akash.comparator.ex1;

import java.util.Objects;

public class Employyee implements Comparable<Employyee> {
    private int id;
    private  String name;
    private String role;

    public Employyee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employyee employyee = (Employyee) o;
        return id == employyee.id && name.equals(employyee.name) && role.equals(employyee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role);
    }

    @Override
    public String toString() {
        return "Employyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }




    @Override
    public int compareTo(Employyee o) {
        return this.role.compareTo(o.getRole());
    }
}

