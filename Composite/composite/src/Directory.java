import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<FileSystemComponent>();
    public Directory(String name) {
        this.name = name;
    }
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }
    public void copy(String destination) {
        System.out.println("Copying directory " + name + " to " + destination);
        for (FileSystemComponent component : children) {
            component.copy(destination + "/" + name);
        }
    }
    public void move(String destination) {
        System.out.println("Moving directory " + name + " to " + destination);
        for (FileSystemComponent component : children) {
            component.move(destination + "/" + name);
        }
    }
    public void rename(String newName) {
        System.out.println("Renaming directory " + name + " to " + newName);
        this.name = newName;
    }
}