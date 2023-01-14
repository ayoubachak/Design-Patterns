interface Cloneable {
    //marker interface 
}


interface Employee extends Cloneable {
    Employee clone() throws CloneNotSupportedException;
    String getName();
    void setName(String name);
}
class ConcreteEmployee implements Employee, Cloneable {
    private String name;
    public ConcreteEmployee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employee clone() throws CloneNotSupportedException {
        ConcreteEmployee employee = new ConcreteEmployee(this.name);
        return employee;
    }
}
