public interface FileSystemComponent {
    void display();
    void copy(String destination);
    void move(String destination);
    void rename(String newName);
    void add(FileSystemComponent home);
}
