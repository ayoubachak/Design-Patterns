public interface Employee extends Cloneable {
    Employee clone() throws CloneNotSupportedException;
    String getName();
    void setName(String name);
}