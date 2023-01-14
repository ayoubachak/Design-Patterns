public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcreteEmployee original = new ConcreteEmployee("John Doe");
        Employee copy = original.clone();
        copy.setName("Jane Doe");
        System.out.println("Original: " + original.getName());
        System.out.println("Copy: " + copy.getName());
    }
}

