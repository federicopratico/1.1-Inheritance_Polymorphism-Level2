package Level3.Ex1;

import java.util.Objects;

public class Editor {
    private String name;

    /**
     * Unique ID
     */

    private final String ID;

    /**
     * The salary is the same for all the Editors
     */
    private static double salary = 1600;


    public Editor(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double newSalary) {
        salary = newSalary;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Editor o = (Editor) obj;

        return Objects.equals(getName(), o.getName()) && Objects.equals(getID(), o.getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getID());
    }
}
